package HiveParser.Query;


import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

public class App 
{
    public static void main( String[] args ) throws ParseException
    {	
    	ParseDriver pd = new ParseDriver();
    	ASTNode tree = pd.parse("select * from ddd.abc");
        System.out.println(tree.dump());
    }
}
