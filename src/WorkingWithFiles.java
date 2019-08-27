import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkingWithFiles {
    public WorkingWithFiles() {

        try {
            FileReader fr = new FileReader("E:\\temp text files\\input.txt");
            Scanner scanner = new Scanner(fr);
            BufferedReader br = new BufferedReader(fr);


            FileWriter a = new FileWriter("E:\\temp text files\\a.txt", false);
            FileWriter b = new FileWriter("E:\\temp text files\\b.txt", false);
            FileWriter c = new FileWriter("E:\\temp text files\\c.txt", false);
            FileWriter d = new FileWriter("E:\\temp text files\\d.txt", false);
            FileWriter e = new FileWriter("E:\\temp text files\\e.txt", false);
            FileWriter f = new FileWriter("E:\\temp text files\\f.txt", false);
            FileWriter g = new FileWriter("E:\\temp text files\\g.txt", false);
            FileWriter h = new FileWriter("E:\\temp text files\\h.txt", false);
            FileWriter i = new FileWriter("E:\\temp text files\\i.txt", false);
            FileWriter j = new FileWriter("E:\\temp text files\\j.txt", false);
            FileWriter k = new FileWriter("E:\\temp text files\\k.txt", false);
            FileWriter l = new FileWriter("E:\\temp text files\\l.txt", false);
            FileWriter m = new FileWriter("E:\\temp text files\\m.txt", false);
            FileWriter n = new FileWriter("E:\\temp text files\\n.txt", false);
            FileWriter o = new FileWriter("E:\\temp text files\\o.txt", false);
            FileWriter p = new FileWriter("E:\\temp text files\\p.txt", false);
            FileWriter q = new FileWriter("E:\\temp text files\\q.txt", false);
            FileWriter r = new FileWriter("E:\\temp text files\\r.txt", false);
            FileWriter s = new FileWriter("E:\\temp text files\\s.txt", false);
            FileWriter t = new FileWriter("E:\\temp text files\\t.txt", false);
            FileWriter u = new FileWriter("E:\\temp text files\\u.txt", false);
            FileWriter v = new FileWriter("E:\\temp text files\\v.txt", false);
            FileWriter w = new FileWriter("E:\\temp text files\\w.txt", false);
            FileWriter x = new FileWriter("E:\\temp text files\\x.txt", false);
            FileWriter y = new FileWriter("E:\\temp text files\\y.txt", false);
            FileWriter z = new FileWriter("E:\\temp text files\\z.txt", false);
            ArrayList<FileWriter> alphabets = new ArrayList<>();
            alphabets.add(a);
            alphabets.add(b);
            alphabets.add(c);
            alphabets.add(d);
            alphabets.add(e);
            alphabets.add(f);
            alphabets.add(g);
            alphabets.add(h);
            alphabets.add(i);
            alphabets.add(j);
            alphabets.add(k);
            alphabets.add(l);
            alphabets.add(m);
            alphabets.add(n);
            alphabets.add(o);
            alphabets.add(p);
            alphabets.add(q);
            alphabets.add(r);
            alphabets.add(s);
            alphabets.add(t);
            alphabets.add(u);
            alphabets.add(v);
            alphabets.add(w);
            alphabets.add(x);
            alphabets.add(y);
            alphabets.add(z);



            String string;

            while (scanner.hasNextLine()) { // read a line
                string = scanner.nextLine();
                switch (string.charAt(0)){
                    case 'a':
                        moveToAnotherTextFile(a, string);
                        break;
                    case 'b':
                        moveToAnotherTextFile(b, string);

                        break;
                    case 'c':
                        moveToAnotherTextFile(c, string);
                        break;
                    case 'd':
                        moveToAnotherTextFile(d, string);
                        break;
                    case 'e':
                        moveToAnotherTextFile(e, string);
                        break;
                    case 'f':
                        moveToAnotherTextFile(f, string);
                        break;
                    case 'g':
                        moveToAnotherTextFile(g, string);
                        break;
                    case 'h':
                        moveToAnotherTextFile(h, string);
                        break;
                    case 'i':
                        moveToAnotherTextFile(i, string);
                        break;
                    case 'j':
                        moveToAnotherTextFile(j, string);
                        break;
                    case 'k':
                        moveToAnotherTextFile(k, string);
                        break;
                    case 'l':
                        moveToAnotherTextFile(l, string);
                        break;
                    case 'm':
                        moveToAnotherTextFile(m, string);
                        break;
                    case 'n':
                        moveToAnotherTextFile(n, string);
                        break;
                    case 'o':
                        moveToAnotherTextFile(o, string);
                        break;
                    case 'p':
                        moveToAnotherTextFile(p, string);
                        break;
                    case 'q':
                        moveToAnotherTextFile(q, string);
                        break;
                    case 'r':
                        moveToAnotherTextFile(r, string);
                        break;
                    case 's':
                        moveToAnotherTextFile(s, string);
                        break;
                    case 't':
                        moveToAnotherTextFile(t, string);
                        break;
                    case 'u':
                        moveToAnotherTextFile(u, string);
                        break;
                    case 'v':
                        moveToAnotherTextFile(v, string);
                        break;
                    case 'w':
                        moveToAnotherTextFile(w, string);
                        break;
                    case 'x':
                        moveToAnotherTextFile(x, string);
                        break;
                    case 'y':
                        moveToAnotherTextFile(y, string);
                        break;
                    case 'z':
                        moveToAnotherTextFile(z, string);
                        break;
                    default:
                        break;
                }

            }
            br.close();

            for (FileWriter fw : alphabets){
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void moveToAnotherTextFile(FileWriter fileWriter, Object string){//neveshtan va khundan tu filesh ro ok kon!
        try {
            fileWriter.write(string + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
