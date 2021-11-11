import java.util.ArrayList;
import java.util.Iterator;
public class Iterator
{
	public static void main(String[] args) {
	    	ArrayList<Integer> i = new ArrayList<Integer>();
	    	i.add(12);
	    	i.add(42);
	    	i.add(52);
	    	i.add(62);
	        Iterator<Integer> it = i.iterator();
	        while(it.hasNext()){
	           Integer j = it.next();
	           // System.out.println(j);
	           if(j > 50){
	               it.remove();
	           }
	           //System.out.println(it.next());
	        }
		    System.out.println(i); //[12,42] { 52 and 62 removed }
// 		ArrayList<String> st = new ArrayList<String>();
// 		st.add("simran");
// 		st.add("jyoti");
// 		st.add("sonam");
// 		st.add("Guddu");
// 		Iterator<String> it = st.iterator();
// 		while(it.hasNext()){
	
// 		System.out.println(it.next());
// // 		System.out.println(it.next());
// 		}
// 		System.out.println(it.next());
// 		// creating Object
// 		Persion p1 = new Persion();
// 		Persion p2 = new Persion();
// 		p1.name = "Simran";
// 		p1.roll = 2020;
// 		p1.walk();
// // 		System.out.println(p1.name);
//       p2.name = "Jyoti";
//       p2.roll = 1212;
//       p2.walk();
	}
}

// class Persion{
//     String name;
//     int roll;
    
//     void walk(){
//         System.out.println(name + " " + "is walk");
//     }
// }

