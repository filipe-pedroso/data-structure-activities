import java.util.*;


class DnaProblem {
  public ArrayList<Character> b = new ArrayList<>();
  public ArrayList<Character> e = new ArrayList<>();
}

public class Main {

  public static ArrayList<Character> process(DnaProblem spec) {
    
    Queue<Character> q = new LinkedList<Character>();
    Stack<Character> stk = new Stack<Character>();

    for (int i=0;i<spec.e.size();i++) {
        if (spec.e.get(i)=='f' || spec.e.get(i)=='F') {
            for (int j=0;j<spec.b.size();j++) {
                q.add(spec.b.get(j));
            }
            int aux = 0;
            while (!q.isEmpty()) {
                char novo = q.peek();
                spec.b.set(aux, novo);
                aux++;
                q.remove();
            }
        } else if (spec.e.get(i)=='p' || spec.e.get(i)=='P') {
            for (int j=0;j<spec.b.size();j++) {
                stk.add(spec.b.get(j));
            }
            int aux = 0;
            while (!stk.isEmpty()) {
                char novo = stk.peek();
                spec.b.set(aux, novo);
                aux++;
                stk.pop();
            }
        }
    }
    return spec.b;
  }

   
  public static void main(String[] args) {
    DnaProblem spec = new DnaProblem();
    try (Scanner s = new Scanner(System.in)) {
      int nb = s.nextInt();
      int ne = s.nextInt();
      spec.b.ensureCapacity(nb);
      spec.e.ensureCapacity(ne);
      while (nb-- > 0) {
        spec.b.add(s.next().charAt(0));
      }
      while (ne-- > 0) {
        spec.e.add(s.next().charAt(0));
      }
    }
    ArrayList<Character> result = Main.process(spec);
    result.forEach((x) -> {
      System.out.println(x);
    });
  }
}