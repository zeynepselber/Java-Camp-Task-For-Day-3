package taskForDay_3;

public class InstructorManager extends UserManager{

	private Instructor instructor ;
	
	public InstructorManager(Instructor instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public void add() {
		System.out.println("Yeni e�itmen kayd� olu�turuldu.");
	}
	
	@Override
	public void list() {
		System.out.println("E�itmen ID : " +instructor.getId());
		System.out.println("E�itmen Ad - Soyad : " +instructor.getFirstName()+ " " + instructor.getLastName());
		System.out.println("E�itmen Email : " +instructor.getEmail());
		System.out.println("E�itmen Kullan�c� Ad� : " +instructor.getUsername());
		System.out.println("Hakk�nda : " +instructor.getAbout());
		
		System.out.println("E�itim verdi�i dersler : " );
		String[] lessons = instructor.getLessonNames();
		
		for(String lesson : lessons) {
			System.out.println(lesson);
		}
		
	}
	
	@Override
	public void update() {
		System.out.println("E�itmen bilgileri g�ncellendi");
	}
	
	@Override
	public void remove() {
		System.out.println("E�itmen kayd� silindi.");
	}
	
	@Override
	public void setPassword(String password) {
		instructor.setPassword(password);
		
		System.out.println("E�itmen �ifresi de�i�tirildi.");
	}
}
