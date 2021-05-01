package taskForDay_3;

public class Instructor extends User{

	private String about ;
	private String[] lessonNames ;
	
	public String getAbout() {
		return this.about ;
	}
	
	public void setAbout( String about ) {
		this.about = about ;
	}
	
	public String[] getLessonNames() {
		return this.lessonNames ;
	}
	
	public void setLessonNames( String[] lessonNames ) {
		this.lessonNames = lessonNames ;
	}

}
