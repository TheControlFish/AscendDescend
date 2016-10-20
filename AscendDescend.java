import java.util.*;
public class AscendDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []blah = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(blah);
		System.out.println("Ascend:          " + "Descend:");
		for (int n = 0; n < blah.length; n++){
		System.out.print(blah[n]);
		for (int j = 0; j < 17 - blah[n].length(); j++){
			System.out.print(" ");
		}
		System.out.println(blah[blah.length - n - 1]);
		}
	}

}
