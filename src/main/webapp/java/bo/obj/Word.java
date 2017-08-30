package bo.obj;

/**
 * Created by smgri on 7/13/2017.
 */
public class Word {
    private String transID;
    private int docID;
    private int lineNo;
    private int wordNo;
    private String URN;
    private String annotation;

    public Word(String transID, int docID, int lineNo, int wordNo, String URN, String annotation) {
        this.transID = transID;
        this.docID = docID;
        this.lineNo = lineNo;
        this.wordNo = wordNo;

        this.URN = URN;
        this.annotation = annotation;
    }

    public String getTransID() {
        return transID;
    }

    public int getDocID() {
        return docID;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getWordNo() {
        return wordNo;
    }

    public String getURN() {
        return URN;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public void setWordNo(int wordNo) {
        this.wordNo = wordNo;
    }

    public void setURN(String URN) {
        this.URN = URN;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
