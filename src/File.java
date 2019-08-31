import java.io.*;


    public class File implements Serializable {
        private String path;
        private FileOutputStream writer;
        private ObjectOutputStream ObjectWriter;
        private ObjectInputStream ObjectReader;
        private FileInputStream reader;


        public File() {
            path = null;
            reader = null;
            ObjectReader = null;
            ObjectWriter = null;
            writer = null;
        }


        public static String findPath(String word) {
            return (word.charAt(0) + ".txt");
        }

        public static void writeToFile(Object object, String path) {
            FileOutputStream fileOut;
            try {
                fileOut = new FileOutputStream(path);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                objectOut.writeObject(object);
                objectOut.close();
                System.out.println("The Object  was succesfully written to a file");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static Object readFromFile(String path) {
            FileInputStream fileIn;
            try {

                fileIn = new FileInputStream(path);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                Object obj = objectIn.readObject();
                System.out.println("The Object has been read from the file");
                objectIn.close();
                return obj;

            } catch (Exception ex) {
//            ex.printStackTrace();
                return null;
            }
        }


        public static void inputRead() throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String temp;
            HashMap tempHashmap;
            while ((temp = reader.readLine()) != null) {
                String key = temp.split(":")[0];
                String value = temp.split(":")[1];

                tempHashmap = (HashMap) readFromFile(findPath(key)); //object from hashmap class
                if (tempHashmap == null) {
                    tempHashmap = new HashMap(1000);
                }

                tempHashmap.put(key, value);
                writeToFile(tempHashmap, findPath(key));

            }
        }


        public static void main(String[] args) throws IOException {

            inputRead();
        }
    }



