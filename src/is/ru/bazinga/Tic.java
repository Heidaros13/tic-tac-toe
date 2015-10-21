package is.ru.bazinga;

public class Tic {

public static final int ROWS = 3;
public static final int COLUMNS = 3;
public static int [][] gameBoard = new int [ROWS][COLUMNS];

public static void printGameBoard()
{
	for(int i = 0 ; i < ROWS ; i++)
	{
		for(int j = 0 ; j < COLUMNS ; j++)
		{ 
			System.out.print(" H ");
		}
	}


}




}

