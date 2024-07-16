public class Permutation{

    private char[] characters;
    private StringBuilder buffer = new StringBuilder();
    private int calls = 0;
    private int lvl = 0;

    public Permutation(int sz){
        characters = new char[sz];
    }

    public Permutation(char[] arr){
        characters = arr;
    }
    // simpleified solution from Heap
    public void calculate(int k){ // k == arr.length to begin
        calls++;lvl++;
        //System.out.print("--- " + calls + " : " + k);
        if ( k==1 ){ // is k==1 is all the unique permutations ? How Come ? It just works....Stop repetitions sooner...
            System.out.print(k+" ");
            System.out.print(this.toString());
            System.out.print(" : no  swap " + i + " " + (k-1) + " : " + this.toString() + " lvl " + lvl + "\n");
            //writeLnToBuffer(this.toString());    
            //return;
        } else {
            for (int i=0; i < k ;i++){
                calculate(k-1);
                if ( k % 2 == 0){ 
                    System.out.print(k+" ");
                    System.out.print(this.toString());
                    swap(i,k-1);
                    System.out.print(" : swapping " + i + " " + (k-1) + " : " + this.toString() + " lvl " + lvl + "\n");
                } else {
                    System.out.print(k+" ");
                    System.out.print(this.toString()); 
                    swap(0,k-1);
                    System.out.print(" : swapping " + i + " " + (k-1) + " : " + this.toString() + " lvl " + lvl + "\n");
                }
                //calculate(k-1);
            }
        }
       // System.out.println(this.toString() + " ( exit ) ");
        lvl--;
    }

    private void swap(int i, int j){
        char tmp = characters[i];
        characters[i] = characters[j];
        characters[j] = tmp;
    }

    public String toString(){
        return String.valueOf(characters);
    }

    public int length(){
        return characters.length;
    }

    public int numberOfIterations(){
        return iterations;
    }

    public void createFile(){
        TxtFileGenerator file = new TxtFileGenerator();
        file.write(output.toString());
    }

    private writeLnToBuffer(String s){
        buffer.append(this.toString());
        buffer.append("\n");
    }
}