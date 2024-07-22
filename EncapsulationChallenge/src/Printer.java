public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        this(100, true);
    }

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel < 0) {
            tonerLevel = 0;
        } else if (tonerLevel > 100) {
            tonerLevel = 100;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if ((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) < 0) {
            System.out.println("Invalid toner lever");
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToBePrinted;
        if(duplex) {
            pagesToBePrinted = (pages / 2) + (pages % 2);
            System.out.println("Duplex printer detected, saving paper and printing on both sides!");
        } else {
            pagesToBePrinted = pages;
        }
        pagesPrinted += pagesToBePrinted;
        return pagesToBePrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
