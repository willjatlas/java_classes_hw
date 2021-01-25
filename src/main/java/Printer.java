public class Printer {

    // Init variables
    int maxPaper;
    int curPaper;
    int maxToner;
    int curToner;

    // Constructor
    public Printer(int maxToner, int curToner,
                   int maxPaper, int curPaper){

        this.maxToner = maxToner;
        this.curToner = curToner;
        this.maxPaper = maxPaper;
        this.curPaper = curPaper;

    }

    // Load the printer with paper.
    public int addPaper(int amount){
        int sum = amount + curPaper;
        if (sum > maxPaper){
            int overs = sum - maxPaper;
            curPaper  = maxPaper;
            return overs;
        }
        else{
            return 0;
        }
    }

    // Prints number of pages * copies if there is enough paper and toner. 
    public int print(int numPages, int numCopies) {
        int sum = numCopies * numPages;
        if (sum <= curPaper && sum <= curToner) {
            curPaper -= sum;
            curToner -= sum;
            return sum;
        }
        return 0;
    }

}
