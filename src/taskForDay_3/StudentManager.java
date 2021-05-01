package taskForDay_3;

public class StudentManager extends UserManager{

	private Student student ;
	
	public StudentManager(Student student) {
	
		this.student = student ;
	}
	
	@Override
	public void add() {
		System.out.println("Öðrenci kaydý oluþturuldu.");
	}
	
	@Override
	public void list() {
		System.out.println("Öðrenci ID : " +student.getId());
		System.out.println("Öðrenci Ad - Soyad : " +student.getFirstName()+ " " + student.getLastName());
		System.out.println("Öðrenci Email : " +student.getEmail());
		System.out.println("Öðrenci Kullanýcý Adý : " +student.getUsername());
		System.out.println("Öðrenci Numarasý : " +student.getStudentNumber());
		System.out.println("Öðrenci Profil : " +student.getProfilePicture());
		System.out.println("Öðrenci Adres : " +student.getAddress());
		
		System.out.println("Eðitim verdiði dersler : " );
		String[] certificates = student.getCertificates();
		
		if( certificates.length > 0 ) {
			for(String certificate : certificates) {
				System.out.println(certificate);
			}
		}
		else
			System.out.println("Sertifika bilgisi bulunmamaktadýr.");
		
		
	}
	
	@Override
	public void update() {
		System.out.println("Öðrenci bilgileri güncellendi");
	}
	
	@Override
	public void remove() {
		System.out.println("Öðrenci kaydý silindi.");
	}
	
	@Override
	public void setPassword(String password) {
		student.setPassword(password);
		
		System.out.println("Öðrenci þifresi deðiþtirildi.");
	}
}
