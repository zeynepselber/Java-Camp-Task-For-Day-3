package taskForDay_3;

public class Main {

	public static void main(String[] args) {
	
		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("Zeynep") ;
		student.setLastName("SELBER") ;
		student.setEmail("zeynep.selber@gmail.com");
		student.setUsername("zselber");
		student.setPassword("1234");
		student.setProfilePicture("https://www.w3schools.com/css/img_forest.jpg");
		student.setAddress("�STANBUL");
		student.setCertificates(new String[] {});

		Instructor instructor = new Instructor();
		
		instructor.setId(1);
		instructor.setFirstName("Engin") ;
		instructor.setLastName("DEM�RO�") ;
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setUsername("edemirog");
		instructor.setPassword("1234");
		instructor.setProfilePicture("https://www.w3schools.com/css/img_lights.jpg");
		instructor.setAbout("MCT,PMP,ITIL");
		
		String[] lessons = new String[] {"C# + Angular" , "JAVA + REACT" } ;
		instructor.setLessonNames(lessons) ;

		UserManager userManager             = new UserManager();
		StudentManager studentManager       = new StudentManager( student );
		InstructorManager instructorManager = new InstructorManager( instructor ) ;
		
		System.out.println("_________YEN� KAYIT ��LEMLER�___________________________");
		
		studentManager.add() ;
		
		instructorManager.add();
		
		System.out.println("\n_________L�STELEME ��LEMLER�___________________________");
		
		userManager.show(studentManager);
		
		userManager.show(instructorManager);
		
		System.out.println("\n_________G�NCELLEME ��LEMLER�___________________________");
		
		studentManager.update() ;
	
		instructorManager.update();
		
		System.out.println("\n_________��FRE G�NCELLEME ��LEMLER�_____________________");
		
		userManager.updatePassword(studentManager , "1111");
		userManager.updatePassword(instructorManager , "1111");
		
		System.out.println("\n_________KAYIT S�LME ��LEMLER�__________________________");
		
		studentManager.remove() ;
		
		instructorManager.remove();
		
	}

}

