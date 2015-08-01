import java.util.Random;


public class Dado {
	
	public int cacular(int faces){
		Random rn = new Random();
		int answer = rn.nextInt(faces) + 1;
		return answer;
	}

}


