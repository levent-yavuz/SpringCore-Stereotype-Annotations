# Stereotype Annotations

Spring provides further stereotype annotations: @Component, @Service, and @Controller. @Component is a generic stereotype for any Spring-managed component.

![image](https://user-images.githubusercontent.com/113794977/191054483-37b4912d-06ce-44b2-b042-bcb20d75b9ab.png)

@Repository, @Service, and @Controller are specializations of @Component for more specific use cases (in the persistence, service, and presentation layers, respectively). They are technically the same, but we use them for the different purposes.

@Repository -> in DAO/Persistence Layer

@Service -> in Service Layer (Business Logic)

@Controller -> is used at class level in Spring MVC.

 [org.springframework.stereotype](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/package-summary.html)

## TeamDAOImpl Class
```
@Repository(value = "teamDAOImpl")
public class TeamDAOImpl implements TeamDAO{

	@Override
	public void insertTeam(Team team) {
		// TODO Auto-generated method stub
	
		teams.add(team);
		//System.out.println( team.getName() + " is inserted");	
	}

	@Override
	public void displayTeams() {
		
		teams.stream().forEach(System.out::println);
	}
}
```

## TeamServiceImpl Class
```
@Service(value = "teamServiceImpl")
public class TeamServiceImpl implements TeamService{

	@Autowired
	TeamDAO teamDAO;

	public void insertTeam(Team team) {
		
		teamDAO.insertTeam(team);
		
    //System.out.println("TeamService inserted Team ");
	}

	@Override
	public void displayTeams() {
		
		teamDAO.displayTeams();	
	}
}
```
 ## @Configuration and @ConponentScan Annotations
 To autodetect all classes and register the corresponding beans,  @ComponentScan and @Configuration is added Configuration(AppConfig) class.

## AppConfig Class
```
@Configuration
@ComponentScan(basePackages = "com.levent.stereotype")
public class AppConfig {
	
	@Bean
	public Team team1() {
		
		return new Team("Manchester City", "The Sky Blues", "Blue and White", 6);
	}
	@Bean
	public Team team2() {
			
			return new Team("Liverpool", "The Reds", "Red", 19);
		}
	@Bean
	public Team team3() {
		
		return new Team("Manchester United", "The Red Devils ", "Red and White", 20);
	}
	@Bean
	public Team team4() {
		
		return new Team("Chelsea", "The Blues", "White and Blue", 6);
	}
}
```
## Test Class and Output
```
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
TeamService teamService = context.getBean("teamServiceImpl", TeamServiceImpl.class);
		
Team team1 = context.getBean("team1",Team.class);
Team team2 = context.getBean("team2",Team.class);
Team team3 = context.getBean("team3",Team.class);
Team team4 = context.getBean("team4",Team.class);
		
teamService.insertTeam(team1);
teamService.insertTeam(team2);
teamService.insertTeam(team3);
teamService.insertTeam(team4);
		
teamService.displayTeams();	    
    
Team [name=Manchester City, nickName=The Sky Blues, shirtColor=Blue and White, championshipsWon=6]
Team [name=Liverpool, nickName=The Reds, shirtColor=Red, championshipsWon=19]
Team [name=Manchester United, nickName=The Red Devils , shirtColor=Red and White, championshipsWon=20]
Team [name=Chelsea, nickName=The Blues, shirtColor=White and Blue, championshipsWon=6]
