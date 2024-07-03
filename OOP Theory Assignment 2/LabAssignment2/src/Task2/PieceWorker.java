
package Task2;

public class PieceWorker extends Employee {
    
    private double wagePerPiece;
    private int NoOfPieces;

    public PieceWorker(double wagePerPiece, int NoOfPieces, String firstName, String lastName, String socialSecurityNumber, Date dob) {
        super(firstName, lastName, socialSecurityNumber, dob);
        this.wagePerPiece = wagePerPiece;
        this.NoOfPieces = NoOfPieces;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setWagePerPiece(double wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }

    public int getNoOfPieces() {
        return NoOfPieces;
    }

    public void setNoOfPieces(int NoOfPieces) {
        this.NoOfPieces = NoOfPieces;
    }
    
    @Override
    public double earnings() {
        return (getNoOfPieces()*getWagePerPiece());
    }

    @Override
    public String toString() {
        return "PieceWorker{" + "wagePerPiece=" + wagePerPiece + ", NoOfPieces=" + NoOfPieces + '}';
    }
    
}
