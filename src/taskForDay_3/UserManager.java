package taskForDay_3;

public class UserManager {

	public void add() {
		System.out.println("Kullanýcý kaydý olusturuldu.");
	}
		
	public void list() {
		System.out.println("Kullanýcý bilgileri listeleniyor.");
	}
	
	public void show( UserManager userManager ) {
		System.out.println("Kullanýcý bilgileri aþaðýdaki gibidir.");
	    userManager.list();
		
	}
	
	public void update() {
		System.out.println("Kullanýcý bilgileri güncellendi");
	}
	
	public void remove() {
		System.out.println("Kullanýcý kaydý silindi.");
	}
	
    public void setPassword(String password) {
		System.out.println("Kullanýcý þifresi deðiþtiriliyor");
	}
	
	public void updatePassword( UserManager userManager , String password) {
		System.out.println("Kullanýcý þifresi deðiþtiriliyor ... Lütfen bekleyiniz.");
		userManager.setPassword(password);
	}
}
