package eu.jajugoshy.javadev;

public class XmasTreeCreator {
    private static String character;
    public  String createXmasTree(String text, int levels, String side) {
        String tree;
        this.character = text;
        switch(side)
        {
            case "left": tree = this.left(levels); break;
            case "right": tree = this.right(levels); break;
            case "down": tree = this.down(levels); break;
            default: tree = this.top(levels); break;
        }
        return tree;
    }
    
    private static String createLine(int spaces, int text)
    {  
       StringBuilder sb = new StringBuilder();
       StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();  
       if(spaces!=0) for(int i=0;i<spaces;i++) sb1.append(" ");
       for(int i=0;i<=text;i++) sb2.append(character);
       sb.append(sb1.toString());
       sb.append(sb2.toString());
       return sb.toString();
    }

    private String left(int lev) {
        StringBuilder right = new StringBuilder();
        StringBuilder topPart = new StringBuilder();
        int treeCount=0;
        if((lev % 2)==0) treeCount = lev/2;
        else treeCount = (lev-1)/2+1;
        for(int i=0; i<treeCount;i++)
            {
                int spaces = lev-1-2*i;
                int text = 2*i;
                topPart.append(XmasTreeCreator.createLine(spaces,text));
                topPart.append("\n");
            }
        right.append(topPart);
        StringBuilder botPart = new StringBuilder();
        for(int i=treeCount-2; i>=0;i--)
            {
                int spaces = lev-1-2*i;
                int text = 2*i;
                botPart.append(XmasTreeCreator.createLine(spaces,text));
                if(i!=0)botPart.append("\n");
            }
        right.append(botPart);
        return right.toString();
    }

    private String right(int lev) {
        StringBuilder right = new StringBuilder();
        StringBuilder topPart = new StringBuilder();
        int treeCount=0;
        if((lev % 2)==0) treeCount = lev/2;
        else treeCount = (lev-1)/2+1;
        for(int i=0; i<treeCount;i++)
            {
                int text = 2*i;
                topPart.append(XmasTreeCreator.createLine(0,text));
                topPart.append("\n");
            }
        StringBuilder botPart = new StringBuilder();
        for(int i=treeCount-2; i>=0;i--)
            {
                int text = 2*i;
                botPart.append(XmasTreeCreator.createLine(0,text));
                if(i!=0)botPart.append("\n");
            }
        right.append(topPart);
        right.append(botPart);
        return right.toString();
    }

    private String down(int lev) {
        StringBuilder down = new StringBuilder();
        for(int i=lev-1; i>=0;i--)
            {
                int spaces = lev-i-1;
                int text = 2*i;
                down.append(XmasTreeCreator.createLine(spaces,text));
                if(i!=0)down.append("\n");
            }
        return down.toString();
    }

    private String top(int lev) {
        StringBuilder top = new StringBuilder();
        for(int i=0; i<lev;i++)
            {
                int spaces = lev-i-1;
                int text = 2*i;
                top.append(XmasTreeCreator.createLine(spaces,text));
                if(i!=lev-1)top.append("\n");
             }
        return top.toString();
    }

}
