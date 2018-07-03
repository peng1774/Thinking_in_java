package chap7_polymorphism.excercise16;
import static java.lang.System.out;

class AlertStatus{
	public void display(){ out.println("AlertStatus"); }
}
class AlertStatusIdle extends AlertStatus{
	public void display(){ out.println("AlertStatusIdle!"); }
}
class AlertStatusWarning extends AlertStatus{
	public void display(){ out.println("AlertStatusWarning!"); }
}
class AlertStatusActive extends AlertStatus{
	public void display(){ out.println("AlertStatusActive!"); }
}

class StarShip{
	AlertStatus a = new AlertStatus();
	public void showPannel(){
		a.display();
	}
	public void switchIdle(){
		a = new AlertStatusIdle();
	}
	public void switchWarning(){
		a = new AlertStatusWarning();
	}
	public void switchActive(){
		a = new AlertStatusActive();
	}
}

public class Excercise16{
	private static StarShip s = new StarShip();
	public static void main(String[] args){
		s.showPannel();
		s.switchIdle();
		s.showPannel();
		s.switchWarning();
		s.showPannel();
		s.switchActive();
		s.showPannel();
	}
}