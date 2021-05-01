package taskForDay_3;

public class UserManager {

	public void add() {
		System.out.println("Kullan�c� kayd� olusturuldu.");
	}
		
	public void list() {
		System.out.println("Kullan�c� bilgileri listeleniyor.");
	}
	
	public void show( UserManager userManager ) {
		System.out.println("Kullan�c� bilgileri a�a��daki gibidir.");
	    userManager.list();
		
	}
	
	public void update() {
		System.out.println("Kullan�c� bilgileri g�ncellendi");
	}
	
	public void remove() {
		System.out.println("Kullan�c� kayd� silindi.");
	}
	
    public void setPassword(String password) {
		System.out.println("Kullan�c� �ifresi de�i�tiriliyor");
	}
	
	public void updatePassword( UserManager userManager , String password) {
		System.out.println("Kullan�c� �ifresi de�i�tiriliyor ... L�tfen bekleyiniz.");
		userManager.setPassword(password);
	}
}
