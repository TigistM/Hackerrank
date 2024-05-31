package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Tests {

	public class Solutions {

		/*
		 * Complete the 'decryptPassword' function below.
		 *
		 * The function is expected to return a STRING. The function accepts STRING s as
		 * parameter.
		 */

		public static String decryptPassword(String s) {
			// Write your code here

    // using string builder , queue and a stack with time complexity of O(n);

			StringBuilder str = new StringBuilder();
			Stack<Character> stack = new Stack<>();
			Queue<Character> que = new LinkedList<>();

			for (int i = 0; i < s.length(); i++)
				que.add(s.charAt(i));
			
			while (!que.isEmpty()) {
				char c = que.remove();

				// if s[i] lowercase and s[i+1] = uppercase then swap then and append '*'
				// this is to decrypt it back
				if (Character.isUpperCase(c) && !que.isEmpty() && Character.isLowerCase(que.peek())) {
					char n = que.remove();

					if (Character.isLowerCase(n) && !que.isEmpty() && que.peek() == '*') {
						que.remove();// remove *
						str.append(n);
						str.append(c);

					} else if (Character.isLowerCase(n) && (!que.isEmpty() && que.peek() != '*') || (que.isEmpty())) {
						// if not *, do not swap and append as is
						str.append(c);
						str.append(n);
					}

				} else if (Character.isDigit(c)) { // decrypt the case: if s[i] is digit then replace it with 0 and move
													// the digit s[i] to the front
					System.out.println(" zero  here?");
					if (c == '0' && !stack.isEmpty()) {
						char x = stack.pop();
						str.append(x);

					} else if (c == '0' && stack.isEmpty()) {
						str.append(c);
					} else if (c != '0') {
						stack.push(c);
					}

				} else { // otherwise leave it as is
					str.append(c);
				}
			}
		
			
			if(!stack.isEmpty()) // no 0 replacements were found in the queue for the digits in the stack, hence append all
			{
				while(!stack.isEmpty())
				{
					str.append(stack.pop());
				}
			}
		
			return str.toString();
		}

	}

	public static void main(String[] args) throws IOException {
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
  
 	String s = bufferedReader.readLine();
	//	String s2 = "1627273761999247677859956474766586796469467233619275878629197677999"
	//			+ "121541786647912384129226143882366555584893398554529847555547212127856"
	//			+ "6245923667129246388613384744546184685768438777639198578445734167388189"
	//			+ "64878141385277842779877846816739434236214346841147489736416295881452383"
	//			+ "783532762798811859157354371152572177782627411819216197323561218397681937"
	//			+ "3794973923144229897687684779821225916985176926153956795539441298483551635"
	//		+ "455224424487182819562293139689338372995955475867645185555349174274531452449"
	//			+ "526582778186297535187578767936783116138953489673939513549595983486854514942"
	//			+ "931194942588191676799228124911185344424161818222795958967638645741524219542"
	//			+ "981484555929469293727574783887979788369682837536934519825385521743789476547"
	//			+ "8412643539892327398313236937665838633615687379218136349241172649517792865698"
	//			+ "4164538527921982352595154129476235243571756677746728325752365678339491352341"
	//			+ "3322853163831932479695322325488564289922789491416462331122699393129932925659"
  //				+ "361492349483813386899736296142727614721564543879237369681699726222232Ghmx0tDx";
		
    //		String s ="6UDTyn0Hm*BqBp*ur";

		// "51Pa*0Lp*0e"; 1Bl*Kg*u0; PTo*Ta*0 6UDTyn0Hm*BqBp*ur   487RESx*Fpd0Xukr0m0Du  a
		// 16272737619992476778599564747665867964694672336192758786291976779991215417866479123841292261438823665555848933985545298475555472121278566245923667129246388613384744546184685768438777639198578445734167388189648781413852778427798778468167394342362143468411474897364162958814523837835327627988118591573543711525721777826274118192161973235612183976819373794973923144229897687684779821225916985176926153956795539441298483551635455224424487182819562293139689338372995955475867645185555349174274531452449526582778186297535187578767936783116138953489673939513549595983486854514942931194942588191676799228124911185344424161818222795958967638645741524219542981484555929469293727574783887979788369682837536934519825385521743789476547841264353989232739831323693766583863361568737921813634924117264951779286569841645385279219823525951541294762352435717566777467283257523656783394913523413322853163831932479695322325488564289922789491416462331122699393129932925659361492349483813386899736296142727614721564543879237369681699726222232Ghmx0tDx
		String result = Solutions.decryptPassword(s);
		//System.out.print("Password: " + result);

  	bufferedWriter.write(result);
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}

/////////////
