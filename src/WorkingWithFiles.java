import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
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


            FileOutputStream aFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\a.txt"));
            FileOutputStream bFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\b.txt"));
            FileOutputStream cFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\c.txt"));
            FileOutputStream dFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\d.txt"));
            FileOutputStream eFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\e.txt"));
            FileOutputStream fFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\f.txt"));
            FileOutputStream gFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\g.txt"));
            FileOutputStream hFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\h.txt"));
            FileOutputStream iFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\i.txt"));
            FileOutputStream jFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\j.txt"));
            FileOutputStream kFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\k.txt"));
            FileOutputStream lFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\l.txt"));
            FileOutputStream mFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\m.txt"));
            FileOutputStream nFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\n.txt"));
            FileOutputStream oFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\o.txt"));
            FileOutputStream pFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\p.txt"));
            FileOutputStream qFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\q.txt"));
            FileOutputStream rFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\r.txt"));
            FileOutputStream sFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\s.txt"));
            FileOutputStream tFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\t.txt"));
            FileOutputStream uFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\u.txt"));
            FileOutputStream vFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\v.txt"));
            FileOutputStream wFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\w.txt"));
            FileOutputStream xFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\x.txt"));
            FileOutputStream yFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\y.txt"));
            FileOutputStream zFileOutputStream = new FileOutputStream(new File("E:\\temp text files\\z.txt"));



            ArrayList<FileWriter> alphabetsFileWriters = new ArrayList<>();
            alphabetsFileWriters.add(a);
            alphabetsFileWriters.add(b);
            alphabetsFileWriters.add(c);
            alphabetsFileWriters.add(d);
            alphabetsFileWriters.add(e);
            alphabetsFileWriters.add(f);
            alphabetsFileWriters.add(g);
            alphabetsFileWriters.add(h);
            alphabetsFileWriters.add(i);
            alphabetsFileWriters.add(j);
            alphabetsFileWriters.add(k);
            alphabetsFileWriters.add(l);
            alphabetsFileWriters.add(m);
            alphabetsFileWriters.add(n);
            alphabetsFileWriters.add(o);
            alphabetsFileWriters.add(p);
            alphabetsFileWriters.add(q);
            alphabetsFileWriters.add(r);
            alphabetsFileWriters.add(s);
            alphabetsFileWriters.add(t);
            alphabetsFileWriters.add(u);
            alphabetsFileWriters.add(v);
            alphabetsFileWriters.add(w);
            alphabetsFileWriters.add(x);
            alphabetsFileWriters.add(y);
            alphabetsFileWriters.add(z);

            ArrayList<FileOutputStream> alphabetsFileOutputStreams = new ArrayList<>();
            alphabetsFileOutputStreams.add(aFileOutputStream);
            alphabetsFileOutputStreams.add(bFileOutputStream);
            alphabetsFileOutputStreams.add(cFileOutputStream);
            alphabetsFileOutputStreams.add(dFileOutputStream);
            alphabetsFileOutputStreams.add(eFileOutputStream);
            alphabetsFileOutputStreams.add(fFileOutputStream);
            alphabetsFileOutputStreams.add(gFileOutputStream);
            alphabetsFileOutputStreams.add(hFileOutputStream);
            alphabetsFileOutputStreams.add(iFileOutputStream);
            alphabetsFileOutputStreams.add(jFileOutputStream);
            alphabetsFileOutputStreams.add(kFileOutputStream);
            alphabetsFileOutputStreams.add(lFileOutputStream);
            alphabetsFileOutputStreams.add(mFileOutputStream);
            alphabetsFileOutputStreams.add(nFileOutputStream);
            alphabetsFileOutputStreams.add(oFileOutputStream);
            alphabetsFileOutputStreams.add(pFileOutputStream);
            alphabetsFileOutputStreams.add(qFileOutputStream);
            alphabetsFileOutputStreams.add(rFileOutputStream);
            alphabetsFileOutputStreams.add(sFileOutputStream);
            alphabetsFileOutputStreams.add(tFileOutputStream);
            alphabetsFileOutputStreams.add(uFileOutputStream);
            alphabetsFileOutputStreams.add(vFileOutputStream);
            alphabetsFileOutputStreams.add(wFileOutputStream);
            alphabetsFileOutputStreams.add(xFileOutputStream);
            alphabetsFileOutputStreams.add(yFileOutputStream);
            alphabetsFileOutputStreams.add(zFileOutputStream);



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

            closeFileWriters(alphabetsFileWriters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void closeFileWriters(ArrayList<FileWriter> alphabetsFileWriters){
        for (FileWriter fw : alphabetsFileWriters){
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void moveToAnotherTextFile(FileWriter fileWriter, Object obj){//neveshtan va khundan tu filesh ro ok kon!
        try {
            if(obj instanceof String)
                fileWriter.write(obj + "\n");
            else
                fileWriter.write((char[]) obj);///?????????????????
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writingFromHashMapIntoAFile(FileOutputStream fileOutputStream, HashMap hashMap){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hashMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void splitWithDoNoghte( HashMap map, FileReader fr  ) throws IOException {
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }
        br.close();
    }

    public static void splitWithNewLine( HashMap map, FileReader fr  ) throws IOException {
        BufferedReader br = new BufferedReader(fr);
        String line;
        boolean keyInserted = false;
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            if (!keyInserted) {
                keys.add(line);
            } else {
                values.add(line);
            }
            keyInserted = !keyInserted;
        }

        if (keys.size() == values.size()) {
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
        } else
            System.out.println("wrong txt file format!!!");
        br.close();
    }
}
