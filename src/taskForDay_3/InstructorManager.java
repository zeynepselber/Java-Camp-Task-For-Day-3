package taskForDay_3;

public class InstructorManager extends UserManager{

	private Instructor instructor ;
	
	public InstructorManager(Instructor instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public void add() {
		System.out.println("Yeni eðitmen kaydý oluþturuldu.");
	}
	
	@Override
	public void list() {
		System.out.println("Eðitmen ID : " +instructor.getId());
		System.out.println("Eðitmen Ad - Soyad : " +instructor.getFirstName()+ " " + instructor.getLastName());
		System.out.println("Eðitmen Email : " +instructor.getEmail());
		System.out.println("Eðitmen Kullanýcý Adý : " +instructor.getUsername());
		System.out.println("Hakkýnda : " +instructor.getAbout());
		
		System.out.println("Eðitim verdiði dersler : " );
		String[] lessons = instructor.getLessonNames();
		
		for(String lesson : lessons) {
			System.out.println(lesson);
		}
		
	}
	
	@Override
	public void update() {
		System.out.println("Eðitmen bilgileri güncellendi");
	}
	
	@Override
	public void remove() {
		System.out.println("Eðitmen kaydý silindi.");
	}
	
	@Override
	public void setPassword(String password) {
		instructor.setPassword(password);
		
		System.out.println("Eðitmen þifresi deðiþtirildi.");
	}
}
