package curs6;

public class BreakContinueExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==4) {
				break; //se opreste cand ajunge la 4, intrerupe rularea
				//continue - trece peste 4, dar lasa rularea sa continue
			}
			System.out.println(i);
		}

	}

}
