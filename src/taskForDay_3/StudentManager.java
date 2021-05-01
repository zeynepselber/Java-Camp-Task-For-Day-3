package taskForDay_3;

public class StudentManager extends UserManager{

	private Student student ;
	
	public StudentManager(Student student) {
	
		this.student = student ;
	}
	
	@Override
	public void add() {
		System.out.println("��renci kayd� olu�turuldu.");
	}
	
	@Override
	public void list() {
		System.out.println("��renci ID : " +student.getId());
		System.out.println("��renci Ad - Soyad : " +student.getFirstName()+ " " + student.getLastName());
		System.out.println("��renci Email : " +student.getEmail());
		System.out.println("��renci Kullan�c� Ad� : " +student.getUsername());
		System.out.println("��renci Numaras� : " +student.getStudentNumber());
		System.out.println("��renci Profil : " +student.getProfilePicture());
		System.out.println("��renci Adres : " +student.getAddress());
		
		System.out.println("E�itim verdi�i dersler : " );
		String[] certificates = student.getCertificates();
		
		if( certificates.length > 0 ) {
			for(String certificate : certificates) {
				System.out.println(certificate);
			}
		}
		else
			System.out.println("Sertifika bilgisi bulunmamaktad�r.");
		
		
	}
	
	@Override
	public void update() {
		System.out.println("��renci bilgileri g�ncellendi");
	}
	
	@Override
	public void remove() {
		System.out.println("��renci kayd� silindi.");
	}
	
	@Override
	public void setPassword(String password) {
		student.setPassword(password);
		
		System.out.println("��renci �ifresi de�i�tirildi.");
	}
}
