import java.awt.Color;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JProgressBar;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
/* Version 1.03
-if statement added(else)
-if statement now compound
-while is now compounded
-all loops and if's can work if both are variables
-experations
-else added
-for loop only increasing
*/
public class NewJFrame extends javax.swing.JFrame {
    JProgressBar pb;
    File file;
    FileWriter writ;
    BufferedWriter write;
    DoubleLinklist dataList, functionsList;
    
    //constructor
    public NewJFrame() {
        initComponents();
        pb=new JProgressBar();
        pb.setBounds(830, 800, 350, 20);
        pb.setStringPainted(true);
        this.add(pb);
        this.setSize(450,450);
        this.setLayout(null);
        
    }

    public void makeFile(){
        try{
        
            this.file=new File("name.txt");
            this.writ = new FileWriter(file);
            this.write=new BufferedWriter(writ);
            this.dataList=new DoubleLinklist();
            this.functionsList=new DoubleLinklist();
        }
        catch(Exception e){
            System.out.println("exception in file writer in cons.");
        }
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codeText = new javax.swing.JTextArea();
        convertButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AssemblyCodeBox = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codeText.setColumns(20);
        codeText.setRows(5);
        codeText.setText("int main()\n{\nint count=0;\nint i=0;\nfor(i=3;i<=15;i=i+3)\n{\ncount++;\n}\ncout<<count<<endl;\nreturn 0;\n}\n\n");
        codeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeTextKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(codeText);

        convertButton.setText("Convert");
        convertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertButtonMouseClicked(evt);
            }
        });
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(AssemblyCodeBox);

        jLabel1.setText("Enter C++ Code Here.");

        jLabel2.setText("Equivalent Assembly Code.");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(673, 673, 673)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(65, 65, 65))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(863, 863, 863)
                        .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(898, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(convertButton)
                .addContainerGap(837, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convertButtonActionPerformed

    private void convertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertButtonMouseClicked
        try{
            makeFile();
            String code=codeText.getText();
            includePreCode();
            getCodeLines(code, false);
            writeFunctionsDefiniction();
            update(101);

            closeFile();
            writeToAssemblyBox();
            closeFile();
        }
        catch(Exception e){
            System.err.println("Exception!");
        }
    }//GEN-LAST:event_convertButtonMouseClicked

    private void codeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextKeyPressed
    public void writeToAssemblyBox()throws IOException{
        String line;
        String allData="";
        FileReader writ=new FileReader("name.txt");
        BufferedReader write=new BufferedReader(writ);
        while((line = write.readLine()) != null) {
                allData+=line;
                allData+='\n';
        }  
        AssemblyCodeBox.setText(allData);
    }
            
    public void update(int val){
        pb.setValue(val);
        try {
        Thread.sleep(100);
        } 
        catch (Exception e) {
        }    
    }
    
    public void writeStringToFile (String text) throws IOException{
       write.write(text);
       write.newLine();
       
    }
    
    public void dataConvert(String line)throws IOException{
        String[] temp=new String[2];
        String temp2;
        if(line.substring(0, 3).contentEquals("int")){
            if(line.indexOf("=")!=-1){
                temp= line.substring(3,line.length()).split("\\=");
                temp[1]=temp[1].substring(0,temp[1].length()-1);
                temp[0]=temp[0].substring(1,temp[0].length());
                                                                            //temp[0]->a
                                                                            //temp[1]->value
                dataList.insertAtEnd(temp[0], "dword", Integer.parseInt(temp[1]));  //maintaning queue of variables.

                temp2=temp[0];
                temp2+=" sdword ";
                temp2+=temp[1];
                writeStringToFile(temp2);    
            }
            else{
                temp[0]=line.substring(4, line.length()-1);
                temp[1]="?";
                                                                            //temp[0]->a
                                                                            //temp[1]->value
                dataList.insertAtEnd(temp[0], "dword", -1);  //maintaning queue of variables.

                temp2=temp[0];
                temp2+=" sdword ";
                temp2+=temp[1];
                writeStringToFile(temp2);
                System.out.println("var:" + temp[0]);
            }
            
        }
        else if(line.substring(0, 4).contentEquals("char")){
            if(line.indexOf("=")!=-1){
                
                temp= line.substring(4,line.length()).split("\\=");
                temp[1]=temp[1].substring(0,temp[1].length()-1);
                temp[0]=temp[0].substring(1,temp[0].length());
                System.out.println("asdfasbdawsbduoasdubasudasudgbau");                                                            //temp[0]->a
                                                                            //temp[1]->value
                dataList.insertAtEnd(temp[0], "byte", temp[1]);  //maintaning queue of variables.

                temp2=temp[0];
                temp2+=" byte ";
                temp2+=temp[1];
                writeStringToFile(temp2);    
            }
            else{
                temp[0]=line.substring(5, line.length()-1);
                temp[1]="?";
                                                                            //temp[0]->a
                                                                            //temp[1]->value
                dataList.insertAtEnd(temp[0], "byte", 'n');  //maintaning queue of variables.

                temp2=temp[0];
                temp2+=" byte ";
                temp2+=temp[1];
                writeStringToFile(temp2);
                System.out.println("var:" + temp[0]);
            }
        }
        else if(line.indexOf("string")!=-1){
            if(line.indexOf("=")!=-1){
                temp= line.substring(6,line.length()).split("\\=");
                temp[1]=temp[1].substring(0,temp[1].length()-1);
                temp[0]=temp[0].substring(1,temp[0].length());
                                                                            //temp[0]->a
                                                                            //temp[1]->value
                dataList.insertAtEnd(temp[0], "string", temp[1]);  //maintaning queue of variables.

                temp2=temp[0];
                temp2+=" byte ";
                temp2+=temp[1];
                temp2+=" ,0";
                writeStringToFile(temp2);    
            }
            else{
                temp[0]=line.substring(7, line.length()-1);
                temp[1]="?";
                                                                            //temp[0]->a
                                                                            //temp[1]->value
                dataList.insertAtEnd(temp[0], "string", -1);  //maintaning queue of variables.

                temp2=temp[0];
                temp2+=" byte ";
                temp2+=temp[1];
                writeStringToFile(temp2);
                System.out.println("var:" + temp[0]);
            }
            
        }

    }
    
    public void codepart(int temp)
    {
        if(temp ==0 ) // check that all do we need to insert main start or main end
        {
            try{
            writeStringToFile(code);  
            writeStringToFile(mainwrite);      // main start
           }catch(Exception e)
           {
               System.out.println("Exception in codepart function");
           }
        }
        else
        {
            try{
            writeStringToFile(end);      // main end/ return 0 part
           }catch(Exception e)
           {
               System.out.println("Exception in endpart function");
           }
        }    
    }
    
    public String breakingthestatement(String line) // cout variables and string and newline are seperated from the cout
    {
        int count=0;int start=0;
        while(line.substring(start,2) != "<<")
        {
            count++;
            if(line.charAt(count) == ';' || line.charAt(count) == '<')
            {
                break;
            }
        }
        if(line.charAt(count) == '<') count+=0;
        else coutend=false;
        globalcount=count;
        return line.substring(0,count);
    }
    
    public void outputfunc(String line) // converting c++ cout to assembly Call Write
    {
        String temp;coutend=true;globalcount=0;
        while(coutend)
        {
            temp=breakingthestatement(line);// reading statement and converting to assembly
            try
            {
                if(temp.contentEquals("endl"))
                {
                    writeStringToFile("call crlf");
                    continue;
                }
            }catch(Exception e)
            {
                System.out.println("Error in endl");
            }
            if(dataList.getVariableSize(temp).contentEquals("byte"))
            {
                try
                {
                    {
                        writeStringToFile("movsx eax,"+temp);
                        writeStringToFile("Call WriteChar");
                    }
                    line=line.substring(globalcount+2,line.length());
                }catch(Exception e)
                {
                    System.out.println("");
                }
            }
            else if(dataList.getVariableSize(temp).contentEquals("dword"))
            {
                try
                {
                    {
                        writeStringToFile("mov eax,"+temp);
                        writeStringToFile("Call WriteInt");
                    }
                    line=line.substring(globalcount+2,line.length());
                }catch(Exception e)
                {
                    System.out.println("");
                }
            }
            else
            {
                 try
                {
                    {
                        writeStringToFile("mov edx,offset "+temp);
                        writeStringToFile("Call Writestring");
                    }
                    line=line.substring(globalcount+2,line.length());
                }catch(Exception e)
                {
                    System.out.println("");
                }
            }
        }
    }
    
    public String breakingthestatementin(String line) // parts of input statement (just like cout)
    {
        int count=0;int start=0;
        while(line.substring(start,2) != ">>")
        {
            count++;
            if(line.charAt(count) == ';' || line.charAt(count) == '<')
            {
                break;
            }
        }
        return line.substring(0,count);
    }
    
    public void inputfunc(String line)// cin>> working to convert it in assembly
    {
        String temp;
        temp=breakingthestatementin(line);
        if(dataList.getVariableSize(temp).contentEquals("byte"))
        {
            try
            {
                writeStringToFile("Call ReadChar");
                writeStringToFile("mov "+temp+",al");
            }catch(Exception e)
            {
                   System.out.println("Error in input function");
            }
        }
        else if(dataList.getVariableSize(temp).contentEquals("dword"))
        {
            try
            {
                writeStringToFile("Call ReadInt");
                writeStringToFile("mov "+temp+",eax");
            }catch(Exception e)
            {
                   System.out.println("Error in input function");
            }
        }
        else
        {
            try
            {
                writeStringToFile("mov edx,offset "+temp);
                writeStringToFile("mov ecx,size "+temp);
                writeStringToFile("Call ReadString");
                writeStringToFile(" ");
                writeStringToFile("mov edx,offset "+temp);
                writeStringToFile("mov ecx,size "+temp);
                writeStringToFile("Call ReadString");
            }catch(Exception e)
            {
                   System.out.println("Error in input function");
            }
        }
    }
    public String dowhilebreakvariables(String line)
    {
        String temp=null;
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i) == '<' || line.charAt(i) == '>' || line.charAt(i) == '=' || line.charAt(i) == ')'|| line.charAt(i) == '!'|| line.charAt(i) == '&' || line.charAt(i) == '|' || line.charAt(i) == ';')
            {
                temp=line.substring(1, i);
                break;
            }
        }
        temp.replaceAll(" ", "");
        return temp;
    }
    
    public String dowhilesymbol(String line)
    {
        String temp=null;
        if(line.substring(1,3).contentEquals("<=") || line.substring(1,3).contentEquals(">=") || line.substring(1,3).contentEquals("==") || line.substring(1,3).contentEquals("!=") || line.substring(1,3).contentEquals("&&")|| line.substring(1,3).contentEquals("||"))
        {
            temp=line.substring(1,3);
        }
        else
        {
            temp=line.substring(1,2);
        }
        temp.replaceAll(" ", "");
        return temp;
    }
    
    public void whilepart(String line)
    {
        String firstvar,symbol,secondvar;
        line=line.replaceFirst("while","");
        firstvar=dowhilebreakvariables(line);
        line=line.replaceFirst(firstvar,"");
        symbol=dowhilesymbol(line);
        line=line.replaceFirst(symbol,"");
        secondvar=dowhilebreakvariables(line);
        line=line.replaceFirst(secondvar,"");
        if(line.contentEquals("()"))
        {
        try
        {
            writeStringToFile("while"+(num_of_while-1)+":");
            writeStringToFile("mov eax,"+secondvar);
            writeStringToFile("cmp "+firstvar+",eax");
            
        }catch (Exception e)
        {
            System.out.println("Exception in while loop");
        }
        if(symbol.contentEquals(">"))
        {
            try
            {
                writeStringToFile("JLE"+" endwhile"+(num_of_while-1));
            }catch(Exception e)
            {
                System.out.println("WHILE LOOP PROBLEM");
            }
        }
        if(symbol.contentEquals("<"))
        {
            try
            {
                writeStringToFile("JGE"+" endwhile"+(num_of_while-1));
            }catch(Exception e)
            {
                System.out.println("WHILE LOOP PROBLEM");
            }
        }
        if(symbol.contentEquals("=="))
        {
            try
            {
                writeStringToFile("JNE"+" endwhile"+(num_of_while-1));
            }catch(Exception e)
            {
                System.out.println("WHILE LOOP PROBLEM");
            }
        }
        if(symbol.contentEquals(">="))
        {
            try
            {
                writeStringToFile("JL"+" endwhile"+(num_of_while-1));
            }catch(Exception e)
            {
                System.out.println("WHILE LOOP PROBLEM");
            }
        }
        if(symbol.contentEquals("<="))
        {
            try
            {
                writeStringToFile("JG"+" endwhile"+(num_of_while-1));
            }catch(Exception e)
            {
                System.out.println("WHILE LOOP PROBLEM");
            }
        }
        if(symbol.contentEquals("!="))
        {
            try
            {
                writeStringToFile("JE"+" endwhile"+(num_of_while-1));
            }catch(Exception e)
            {
                System.out.println("WHILE LOOP PROBLEM");
            }
        }
    }
    else
    {
            String firstvar2="",symbol2="",secondvar2="",operator="";
            operator=dowhilesymbol(line);
            line=line.replaceFirst(operator,"");
            firstvar2=dowhilebreakvariables(line);
            line=line.replaceFirst(firstvar2,"");
            symbol2=dowhilesymbol(line);
            line=line.replaceFirst(symbol2,"");
            secondvar2=dowhilebreakvariables(line);
            line=line.replaceFirst(secondvar2,"");
            if(operator.contentEquals("&&"))
            {
                try
                {
                    writeStringToFile("while"+(num_of_while-1)+":");
                    writeStringToFile("mov eax,"+secondvar);
                    writeStringToFile("cmp "+firstvar+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("while PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("mov eax,"+secondvar2);
                    writeStringToFile("cmp "+firstvar2+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol2.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
            }
            else
            {
                line=line.substring(3,line.length());
                line="(".concat(line);
                firstvar2=dowhilebreakvariables(line);
                line=line.replaceFirst(firstvar2,"");
                symbol2=dowhilesymbol(line);
                line=line.replaceFirst(symbol2,"");
                secondvar2=dowhilebreakvariables(line);
                try
                {
                    writeStringToFile("while"+(num_of_while-1)+":");
                    writeStringToFile("mov eax,"+secondvar);
                    writeStringToFile("cmp "+firstvar+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JG"+" excutewhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JL"+" excutewhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JE"+" excutewhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JGE"+" excutewhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JLE"+" excutewhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" excutewhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("mov eax,"+secondvar2);
                    writeStringToFile("cmp "+firstvar2+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol2.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" endwhile"+(num_of_while-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("excutewhile"+(num_of_while-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
    }
}  
    public void endhwhilepart()
    {
        try
        {
            writeStringToFile("jmp "+"while"+(num_of_while-1));
            writeStringToFile("endwhile"+(num_of_while-1)+":");
        }catch (Exception e)
        {
            System.out.println("Problem in endwhilepart");
        }
    }
    
    public void dowhile(String line)
    {
        String firstvar1,secondvar,symbol,operator,firstvar2,secondvar2,symbol2;
        line=line.replaceAll("}while","");
        firstvar1=dowhilebreakvariables(line);
        line=line.replaceFirst(firstvar1,"");
        symbol=dowhilesymbol(line);
        line=line.replaceFirst(symbol,"");
        secondvar=dowhilebreakvariables(line);
        line=line.replaceFirst(secondvar,"");
        if(line.contentEquals("();"))
        {
            try
            {
                writeStringToFile("mov eax,"+secondvar);
                writeStringToFile("cmp "+firstvar1+",eax");
            }catch(Exception e)
            {
                System.out.println("dO WHILE LOOP PROBLEM");
            }
            if(symbol.contentEquals(">"))
            {
                try
                {
                    writeStringToFile("JG"+" dowhile"+(num_of_dowhile-1));
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
            if(symbol.contentEquals("<"))
            {
                try
                {
                    writeStringToFile("JL"+" dowhile"+(num_of_dowhile-1));
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
            if(symbol.contentEquals("=="))
            {
                try
                {
                    writeStringToFile("JE"+" dowhile"+(num_of_dowhile-1));
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
            if(symbol.contentEquals(">="))
            {
                try
                {
                    writeStringToFile("JGE"+" dowhile"+(num_of_dowhile-1));
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
            if(symbol.contentEquals("<="))
            {
                try
                {
                    writeStringToFile("JLE"+" dowhile"+(num_of_dowhile-1));
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
            if(symbol.contentEquals("!="))
            {
                try
                {
                    writeStringToFile("JNE"+" dowhile"+(num_of_dowhile-1));
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
        }
        else
        {
            operator=dowhilesymbol(line);
            line=line.replaceFirst(operator,"");
            if(operator.contentEquals("&&"))
            {
                firstvar2=dowhilebreakvariables(line);
                line=line.replaceAll(firstvar2,"");
                symbol2=dowhilesymbol(line);
                line=line.replaceAll(symbol2,"");
                secondvar2=dowhilebreakvariables(line);
                try
                {
                    writeStringToFile("mov eax,"+secondvar);
                    writeStringToFile("cmp "+firstvar1+",eax");
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("mov eax,"+secondvar2);
                    writeStringToFile("cmp "+firstvar2+",eax");
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" remove"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("jmp dowhile"+(num_of_dowhile-1));
                    writeStringToFile("remove"+(num_of_dowhile-1)+":");
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
            }
            else
            {
                line=line.substring(3,line.length());
                line="(".concat(line);
                firstvar2=dowhilebreakvariables(line);
                line=line.replaceAll(firstvar2,"");
                symbol2=dowhilesymbol(line);
                line=line.replaceAll(symbol2,"");
                secondvar2=dowhilebreakvariables(line);
                try
                {
                    writeStringToFile("mov eax,"+secondvar);
                    writeStringToFile("cmp "+firstvar1+",eax");
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JG"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JL"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JE"+" dwhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JGE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JLE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("mov eax,"+secondvar2);
                    writeStringToFile("cmp "+firstvar2+",eax");
                }catch(Exception e)
                {
                    System.out.println("dO WHILE LOOP PROBLEM");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JG"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JL"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JGE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JLE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" dowhile"+(num_of_dowhile-1));
                    }catch(Exception e)
                    {
                        System.out.println("dO WHILE LOOP PROBLEM");
                    }
                }
            }
        }
    }
    void experation(String line) throws Exception{
        if(line.charAt(line.length()-1)=='_'){
            line=line.substring(0, line.length()-9);
        }
        else{
            line=line.substring(0, line.length()-1);
        }
        
        int temp=0;
        String lhsVar="";
        String size="";
        for(String subline: line.split("=")){
            
            if(temp==1){
                
                if(subline.indexOf("+")!=-1 && subline.indexOf("-")!=-1){
                    if(dataList.search(lhsVar)){
                        size=dataList.getVariableSize(lhsVar);
                    }
                    else{
                        System.err.println("LHS Var was not initialized");
                        writeStringToFile("ERROR!\nUnknown variable \""+ lhsVar+" \"");
                        return;
                    }
                    if(size=="byte"){
                        writeStringToFile("mov eax, 0");
                    }
                    for(String var: subline.split("\\+")){
                        boolean check=false;
                        if(size=="dword"){
                            if(var.indexOf("-")!=-1){
                                int temp2=0;
                                for(String mVar: var.split("\\-")){
                                    if(temp2==0){
                                        writeStringToFile("mov eax, "+ mVar);
                                    }
                                    else{
                                        writeStringToFile("sub eax, "+ mVar);
                                    }
                                    temp2+=1;
                                }
                                check=true;
                            }
                            if(!check){
                                writeStringToFile("mov eax, " + var);
                            }
                            writeStringToFile("add "+ lhsVar+", eax");
                        }
                        else if (size=="byte"){
                            if(var.indexOf("-")!=-1){
                                int temp2=0;
                                for(String mVar: var.split("\\-")){
                                    if(temp2==0){
                                        writeStringToFile("mov al, "+ mVar);
                                    }
                                    else{
                                        writeStringToFile("sub al, "+ mVar);
                                    }
                                    temp2+=1;
                                }
                            }
                            writeStringToFile("mov al, " + var);
                            writeStringToFile("add "+ lhsVar+", al");
                        }
                    }    
                }
                else if(subline.indexOf("+")!=-1){
                    if(dataList.search(lhsVar)){
                        size=dataList.getVariableSize(lhsVar);
                    }
                    else{
                        System.err.println("LHS Var was not initialized");
                        writeStringToFile("ERROR!\nUnknown variable \""+ lhsVar+" \"");
                        return;
                    }
                    if(size=="byte"){
                        writeStringToFile("mov eax, 0");
                    }
                    for(String var: subline.split("\\+")){
                        if(size=="dword"){
                            writeStringToFile("mov eax, " + var);
                            writeStringToFile("add "+ lhsVar+", eax");
                        }
                        else if (size=="byte"){
                            writeStringToFile("mov al, " + var);
                            writeStringToFile("add "+ lhsVar+", al");
                        }
                    } 
                }
                else if(subline.indexOf("-")!=-1){
                    if(dataList.search(lhsVar)){
                        size=dataList.getVariableSize(lhsVar);
                    }
                    else{
                        System.err.println("LHS Var isnot initialized");
                        return;
                    }
                    if(size=="byte"){
                        writeStringToFile("mov eax, 0");
                    }
                    for(String var: subline.split("\\-")){
                        if(size=="dword"){
                            writeStringToFile("mov eax, " + var);
                            writeStringToFile("sub "+ lhsVar+", eax");
                        }
                        else if (size=="byte"){
                            writeStringToFile("mov al, " + var);
                            writeStringToFile("sub "+ lhsVar+", al");
                        }
                    } 
                    
                }
            }
            else if(temp==0){
                lhsVar=subline;
            }
           temp+=1;
        }
        
    }
    void ifstatement(String line)
    {
        String firstvar,symbol,secondvar;
        line=line.replaceAll("________","");
        line=line.replaceAll("if","");
        firstvar=dowhilebreakvariables(line);
        line=line.replaceFirst(firstvar,"");
        symbol=dowhilesymbol(line);
        line=line.replaceFirst(symbol,"");
        secondvar=dowhilebreakvariables(line);
        line=line.replaceFirst(secondvar,"");
        if(line.contentEquals("()"))
        {
            try
            {
                writeStringToFile("mov eax,"+secondvar);
                writeStringToFile("cmp "+firstvar+",eax");

            }catch (Exception e)
            {
                System.out.println("Exception in while loop");
            }
            if(symbol.contentEquals(">"))
            {
                try
                {
                    writeStringToFile("JLE"+" if"+(num_if-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
            if(symbol.contentEquals("<"))
            {
                try
                {
                    writeStringToFile("JGE"+" if"+(num_if-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
            if(symbol.contentEquals("=="))
            {
                try
                {
                    writeStringToFile("JNE"+" if"+(num_if-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
            if(symbol.contentEquals(">="))
            {
                try
                {
                    writeStringToFile("JL"+" if"+(num_if-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
            if(symbol.contentEquals("<="))
            {
                try
                {
                    writeStringToFile("JG"+" if"+(num_if-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
            if(symbol.contentEquals("!="))
            {
                try
                {
                    writeStringToFile("JE"+" if"+(num_if-1));
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            }
        }
        else
        {
            String firstvar2="",symbol2="",secondvar2="",operator="";
            operator=dowhilesymbol(line);
            line=line.replaceFirst(operator,"");
            firstvar2=dowhilebreakvariables(line);
            line=line.replaceFirst(firstvar2,"");
            symbol2=dowhilesymbol(line);
            line=line.replaceFirst(symbol2,"");
            secondvar2=dowhilebreakvariables(line);
            line=line.replaceFirst(secondvar2,"");
            if(operator.contentEquals("&&"))
            {
                try
                {
                    writeStringToFile("mov eax,"+secondvar);
                    writeStringToFile("cmp "+firstvar+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("mov eax,"+secondvar2);
                    writeStringToFile("cmp "+firstvar2+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol2.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
            }
            else
            {
                line=line.substring(3,line.length());
                line="(".concat(line);
                firstvar2=dowhilebreakvariables(line);
                line=line.replaceFirst(firstvar2,"");
                symbol2=dowhilesymbol(line);
                line=line.replaceFirst(symbol2,"");
                secondvar2=dowhilebreakvariables(line);
                try
                {
                    writeStringToFile("mov eax,"+secondvar);
                    writeStringToFile("cmp "+firstvar+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JG"+" excute"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JL"+" excute"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JE"+" excute"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JGE"+" excute"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JLE"+" excute"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" excute"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("mov eax,"+secondvar2);
                    writeStringToFile("cmp "+firstvar2+",eax");

                }catch (Exception e)
                {
                    System.out.println("Exception in while loop");
                }
                if(symbol2.contentEquals(">"))
                {
                    try
                    {
                        writeStringToFile("JLE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<"))
                {
                    try
                    {
                        writeStringToFile("JGE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("=="))
                {
                    try
                    {
                        writeStringToFile("JNE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals(">="))
                {
                    try
                    {
                        writeStringToFile("JL"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("<="))
                {
                    try
                    {
                        writeStringToFile("JG"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                if(symbol2.contentEquals("!="))
                {
                    try
                    {
                        writeStringToFile("JE"+" if"+(num_if-1));
                    }catch(Exception e)
                    {
                        System.out.println("IF PROBLEM");
                    }
                }
                try
                {
                    writeStringToFile("excute"+(num_if-1)+":");
                }catch(Exception e)
                {
                    System.out.println("IF PROBLEM");
                }
            } 
        }
    }
     public void endifpart()
    {
        try
        {
            writeStringToFile("if"+(num_if-1)+":");
        }catch (Exception e)
        {
            System.out.println("Problem in endifpart");
        }
    }
    public void assignment(String line)throws Exception{
        if(line.charAt(line.length()-1)=='_'){
            line=line.substring(0, line.length()-9);
        }
        else{
            line=line.substring(0, line.length()-1);
        }
        int temp=0;
        String var1="", var2="", size="";
        
        
        for(String var: line.split("=")){
            if(temp==0){
                var1=var;
            }
            else{
                var2=var;
            }
            temp+=1;
        }
        if(dataList.search(var1)){
            size=dataList.getVariableSize(var1);
        }
        if(size=="dword"){
            writeStringToFile("mov eax, "+ var2);
            writeStringToFile("mov "+var1+ ", eax");
        }
        else if (size=="byte"){
            
            writeStringToFile("mov eax, 0");
            writeStringToFile("mov al, "+ var2);
            writeStringToFile("mov "+var1+ ", al");
        }
        
        
        
    }
    public String for_inc_dec(String line)
    {
        String temp;
        temp=line.substring(1,2);
        return temp;
    }
    public String for_rate(String line)
    {
        String temp;
        temp=line.substring(2,line.length()-1);
        return temp;
    }
    public void for_expression(String line)
    {
        String ecx,operator,num1,sign,num2,inc_dec,rate;
        line=line.replaceFirst("for","");
        ecx=dowhilebreakvariables(line);
        line=line.replaceAll(ecx,"");
        sign=dowhilesymbol(line);
        line=line.replaceFirst(sign,"");
        num1=dowhilebreakvariables(line);
        line=line.replaceFirst(num1,"");
        line=line.replaceFirst(";","");
        operator=dowhilesymbol(line);
        line=line.replaceFirst(operator,"");
        num2=dowhilebreakvariables(line);
        line=line.replaceFirst(num2,"");
        line=line.replaceFirst(";","");
        if(line.substring(1,3).contentEquals("++") || line.substring(1,3).contentEquals("--"))
        {
            rate="1";
        }
        else
        {
            inc_dec=for_inc_dec(line);
            rate=for_rate(line);
        }
        try
        {
            writeStringToFile("mov ecx,"+num2);
            if(operator.contentEquals("<") || operator.contentEquals("<="))
            {
                writeStringToFile("sub ecx,"+num1);
                writeStringToFile("mov eax,ecx");
                writeStringToFile("mov ebx,"+rate);
                writeStringToFile("mov edx,0");
                writeStringToFile("div ebx");
                writeStringToFile("mov ecx,eax");
                if(operator.contentEquals("<="))
                {
                    writeStringToFile("inc ecx");
                }
                writeStringToFile("l"+num_of_for+":");
            }
        }catch(Exception e)
        {
            System.out.println("Problem in for loop");
        }
    }
    public void endfor()
    {
        try
        {
            writeStringToFile("loop l"+(num_of_for-1));
        }catch(Exception e)
        {
            System.out.println("Problem in endfor");
        }
    }
    Boolean mainflag=false, datastart=false, coutend=true, mainFound=false, Dowhileflag=false, concat=false;
    int globalcount=0;Boolean whileflag=false;int num_if=0;
    String mainwrite="Main Proc";String code=".code";String end="exit\nmain ENDP" ;
    int num_of_dowhile=0; int num_of_while=0;Boolean ifflag=false;Boolean checkelse=false; Boolean endelse=false;
    Boolean startfor=false; int num_of_for=0;
    public void getCodeLines(String code, boolean formFunctionDef)throws Exception{
        update(50);
        
        num_of_dowhile=0;num_of_while=0;num_if=0;num_of_for=0;
        for (String line: code.split("\\n")){
            if(line.contentEquals("")){
                continue;
            }
            String lineDup=line;
            if(line.charAt(0)=='/' && line.charAt(1)=='/'){ //checking if line is comment.
                //this line is comment
            }
            else{
                if(!formFunctionDef){ //checking if this function is called from  definiction function.
                    if(line.length() <= 8){
                        line=line.concat("________");
                        concat=true;
                    }
                    if((line.substring(4,8)).contentEquals("main"))                {
                        mainFound=true;
                        mainflag=true;System.out.println("Main part start");
                    }
                    else if((mainFound) && line.substring(0, 3).contentEquals("int") ||line.substring(0, 4).contentEquals("char") || line.substring(0, 4).contentEquals("long") || line.substring(0, 6).contentEquals("string") ){
                        line=line.replaceAll("________","");
                        dataConvert(line);
                        datastart=true;
                    }
                    if(mainFound && datastart && mainflag && !(line.substring(0, 3).contentEquals("int") || line.substring(0, 4).contentEquals("char") || line.substring(0, 6).contentEquals("string"))){
                        codepart(0);
                        datastart=false;
                    }
                    if(checkelse)
                    {
                        if(line.substring(0,4).contentEquals("else"))
                        {
                            try
                            {
                                writeStringToFile("jmp endelse"+(num_if-1));
                            }catch(Exception e)
                            {
                                System.out.println("IF PROBLEM");
                            }
                            endelse=true;
                            endifpart();
                        }
                        else
                        {
                           endifpart();
                        }
                        checkelse=false;
                    }
                    if(line.substring(0,1).contentEquals("}") && endelse)
                    {
                           try
                           {
                               writeStringToFile("endelse"+(num_if-1)+":");
                           }catch(Exception e)
                           {
                               System.out.println("Problem in else part");
                           }
                           endelse=false;
                    }
                    if(line.substring(0,2).contentEquals("do"))
                    {
                        writeStringToFile("dowhile"+num_of_dowhile+":");
                        num_of_dowhile++;
                        continue;
                    }
                    if(line.substring(1,6).contentEquals("while"))
                    {
                        dowhile(line);
                        continue;
                    }
                    if(line.substring(0,2).contentEquals("if"))
                    {
                        num_if++;ifflag=true;
                        ifstatement(line);
                        continue;
                    }
                    if(line.substring(0,5).contentEquals("while"))
                    {
                        whileflag=true;
                        num_of_while++;
                        whilepart(line);
                        continue;
                    }
                    if(line.substring(0,1).contentEquals("}") && whileflag)
                    {
                        endhwhilepart();whileflag=false;
                    }
                    if(line.substring(0,1).contentEquals("}") && ifflag)
                    {
                        ifflag=false;
                        checkelse=true;
                    }
                    if(line.substring(0,3).contentEquals("for"))
                    {
                        startfor=true;
                        for_expression(line);
                        num_of_for++;
                        continue;
                    }
                    if(line.substring(0,1).contentEquals("}") && startfor)
                    {
                        endfor();
                        startfor=false;
                        continue;
                    }
                    if( (mainFound) && line.substring(0,6).contentEquals("return"))
                    {
                        codepart(1);
                    }
                }
                System.out.println("Last:"+ lineDup.charAt(lineDup.length()-1));
                if(line.indexOf("int")!=-1 && formFunctionDef){
                    writeStringToFile("LOCAL " + line.substring(3,line.length()-1) +" : dword");
                }
                
                if(line.indexOf("char")!=-1 && formFunctionDef){
                    writeStringToFile("LOCAL " + line.substring(4,line.length()-1) +" : byte");
                }
                if (line.indexOf("return")!=-1 && formFunctionDef){
                    writeStringToFile("mov eax, "+line.substring(6, line.length()-1));
                }
                //expresion inc or dec _______________________________________________________________________________________________
                if(line.indexOf("++")!=-1 || line.indexOf("--")!=-1){   //var++
                    for(int i=0; i<line.length(); i++){
                        if(line.charAt(i)=='+'){
                            writeStringToFile("inc "+line.substring(0,i));
                            break;
                        }
                        else if(line.charAt(i)=='-'){
                            writeStringToFile("dec "+line.substring(0,i));
                            break;
                        }
                    }
                }
                
                if(line.indexOf("+=")!=-1 || line.indexOf("-=")!=-1){   // var+=?;
                    String variable="", value="";
                    char sign=0;
                    for(int i=0; i<line.length(); i++){
                        if(line.charAt(i)=='+' || line.charAt(i)=='-'){
                            sign=line.charAt(i);
                            variable=line.substring(0,i);
                            value=line.substring(i+2, line.length()-9);
                            break;
                        }
                    }
                    if(value.contentEquals("1")){
                        
                        if(sign=='+'){
                            writeStringToFile("inc "+ variable);
                        }
                        else if(sign=='-'){
                            writeStringToFile("dec "+variable);
                        }
                    }
                    else{
                        if(sign=='+'){
                           writeStringToFile("mov eax, "+ variable);
                           writeStringToFile("add eax, "+value);
                           writeStringToFile("mov "+variable+", eax");
                           

                       }
                       else if(sign=='-'){
                            writeStringToFile("mov eax, "+ variable);
                            writeStringToFile("sub eax, "+value);
                            writeStringToFile("mov "+variable+", eax");
                       }   
                    }
                    
                    
                }
                if(line.indexOf("=")!=-1 && line.indexOf("+=")==-1 && line.indexOf("-=")==-1 && (line.indexOf("+")!=-1 || line.indexOf("-")!=-1)){ // a=b+c-d;
                    experation(line);
                }
                if(line.indexOf("=")!=-1 && line.indexOf("char")==-1 && line.indexOf("int")==-1 && line.indexOf("+")==-1 && line.indexOf("-")==-1){
                    assignment(line);
                }
                
                if(line.substring(0,6).contentEquals("cout<<"))
                {
                    outputfunc(line.substring(6,line.length()));
                }
                if(line.substring(0,5).contentEquals("cin>>"))
                {
                    System.out.println(line.substring(0,5));
                    inputfunc(line.substring(5,line.length()));
                }
                
                if(line.indexOf("main")==-1 && !formFunctionDef && !(lineDup.charAt(lineDup.length()-1)=='{')){
                    
                    boolean functionFound=false;
                    String functionName="";
                    String returnVariable="NULL";
                    for(int i=0; i<line.length(); i++){
                        if(line.charAt(i)=='('){
                            for(int j=i; j<line.length(); j++){
                                if(line.charAt(j)==')'){
                                    functionFound=true;

                                    break;
                                }
                            }
                            boolean check=false;
                            if(functionFound){

                                for(int k=0; k<line.substring(0,i).length(); k++){
                                    if(line.charAt(k)=='='){
                                        returnVariable=line.substring(0, k);
                                        functionName=line.substring(k+1,i);
                                        check=true;
                                        if(!dataList.search(returnVariable)){
                                            writeStringToFile("ERROR!");
                                            writeStringToFile("Function "+ //app error
                                           "\""+functionName+"\"\'s return value "+"\""+returnVariable+"\""
                                           + " is not decleared first.");   
                                            return;
                                        }
                                        break;
                                    }
                                }

                                if(!check){
                                    functionName=line.substring(0, i);     
                                }
                                if(!dataList.search(functionName)){
                                    if(line.charAt(i+1)==')'){ //Functions without parameter list.
                                        writeStringToFile("mov eax, 0");
                                        writeStringToFile("call "+functionName);
                                        functionsList.insertAtEnd(functionName, 0, returnVariable);   //making list of functions
                                        if(check){ //check=is function returning a value?
                                            retStatement(returnVariable);
                                        }
                                        break;
                                    }
                                    else{ //functions with parameter lists.
                                        int args=makeFunctionCall(line, functionName);
                                        if(check){
                                            retStatement(returnVariable); //checking if function returns a value?
                                        }
                                        if(args==-1){//Error in parameter dected and makeFunctionCall returned -1
                                            return;
                                        } 
                                        else{
                                            writeStringToFile("add ebp, "+ args*4);
                                            functionsList.insertAtEnd(functionName, args, returnVariable);   //making list of functions
                                            break;
                                        }   
                                    }
                                }
                            }
                        }
                    }
                }    
            }
        }
    }
    
    public void retStatement(String returnVariable)throws Exception{
        switch(dataList.getVariableSize(returnVariable)){
            case "byte":
                writeStringToFile("mov "+returnVariable+", al");
                break;
            case "dword":
                writeStringToFile("mov "+returnVariable+", eax");
                break;
        }        
    }
    
    public int makeFunctionCall(String line, String functionName)throws Exception{ //counts no of args and write function call.
        int count=0;
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i)=='('){
                for(String var: line.substring(i+1,line.length()-2).split(",")){
                    if(var.charAt(var.length()-1)=='_'){
                        var=var.substring(0,1);
                    }
                    System.out.println("var:"+var);
                    if(dataList.search(var)){
                        writeStringToFile("push "+var);
                        count+=1;
                    }
                    else{
                        try{
                            Integer.parseInt(var);
                        }
                        catch(NumberFormatException e){
                            writeStringToFile("ERROR!");
                            writeStringToFile("Function "+ //app error
                                    "\""+functionName+"\"\'s parameter "+"\""+var+"\""
                                    + " is not a variable and nor an immediate value.");
                            System.err.println("Function "+ //console error
                                    "\""+functionName+"\"\'s parameter "+"\""+var+"\""
                                    + " is not a variable and nor an immediate value.");
                            return -1;
                        }
                        count+=1;
                        writeStringToFile("mov eax, "+var);
                        writeStringToFile("push eax");
                    }
                }
                writeStringToFile("mov eax, 0");
                writeStringToFile("call "+functionName);
                break;
                    
            }
            
        }
        return count;
    }
    
    
    public void includePreCode() throws IOException{
        writeStringToFile("TITLE My First Program (Example.asm)");
        writeStringToFile("INCLUDE Irvine32.inc");
        writeStringToFile(".data");

    }
    
    public void closeFile()throws IOException{
        write.close();
    }
    
    
    public void writeFunctionsDefiniction()throws Exception{
        mainFound=false;
        int count=0;
        System.out.println("f:"+functionsList.getSize());
         if(functionsList.isEmpty()){
            writeStringToFile("END main");
        }
        else{
             
             String [] args=new String [100];
            boolean skip=false;
            File file=new File("funcDef.txt");
            FileWriter writ=new FileWriter(file);
            BufferedWriter write=new BufferedWriter(writ);
            for(String line: codeText.getText().split("\\n")){
                skip=false;
                if(line.contentEquals("int main(){") || line.contentEquals("int main()")){
                    break;
                }
                DoubleLinklist.Node current=functionsList.head;
                while(current!=null){
                    if(line.indexOf(current.functionName)!=-1){
                        for(int i=0; i<line.length(); i++){
                            if(line.charAt(i)=='('){
                                if(line.charAt(i+1)==')'){
                                    skip=true;
                                    break;
                                }                                    
                                count=0;
                                for(String ar:line.substring(i,line.length()).split(",")){
                                    count+=1;
                                }
                                int j=0;
                                for(String ar:line.substring(i,line.length()).split(",")){
                                    if(ar.indexOf("int")!=-1){
                                        ar=ar.substring(5, ar.length());
                                    }
                                    else if (ar.indexOf("char")!=-1){
                                        ar=ar.substring(6, ar.length());
                                    }
                                    if(ar.indexOf(')')!=-1){
                                        ar=ar.substring(0, ar.length()-2);
                                    }
                                    System.out.println(ar);
                                    args[j]=ar;
                                    j+=1;
                                }
                                
                            }
                        }
                    }
                    if(skip)    break;
                    current=current.next;
                }
                int add=8;
                if(count!=0){
                    for(int i=0; i<count; i++){
                        if(line.indexOf(" "+args[i]+" ")!=-1){
                            int j;
                            for(j=line.indexOf(" "+args[i]+" "); j<line.length(); j++){
                                if(line.charAt(j)==' ' && j>line.indexOf(" "+args[i]+" ")){
                                    break;
                                }
                            }
                            line=line.substring(0, line.indexOf(" "+args[i]+" "))+ "[ebp +"+(add+(i*4))+"]"+ line.substring(j, line.length());
                        }    
                    } 
                    
                }
                write.write(line);
                write.newLine();
            }
            write.close();
            FileReader red=new FileReader("funcDef.txt");
            BufferedReader read=new BufferedReader(red);
            String line;
               

            
            while((line=read.readLine())!=null ){
                if(line.contentEquals("int main(){") || line.contentEquals("int main()")){
                    if(functionsList.isEmpty()) return;
                    else{
                        if(functionsList.getSize()<=1)   writeStringToFile("Error!\n A function definition is missing!");
                        else{
                            writeStringToFile("Error!\n Some function definitions are missing!");
                        }
                        return;
                    }
                }
                
                for(int i=0; i<functionsList.getSize(); i++){
                    
                    if(line.indexOf(functionsList.getElemens(i))!=-1){
                        
                        writeStringToFile("");
                        writeStringToFile(functionsList.head.functionName+" PROC Uses ebx, ecx");
                        writeStringToFile("Push ebp");
                        writeStringToFile("mov ebp, esp");
                        while((line=read.readLine())!=null){
                            if(line.indexOf("}")!=-1){
                                break;
                            }
                            getCodeLines(line, true); // exception here
                        }
                        
                        writeStringToFile("pop ebp");
                        writeStringToFile("ret");
                        writeStringToFile("END main");
                        functionsList.deleteByName(functionsList.getElemens(i));
                        break;
                    }
                }
            }
            
            
        }
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame j=new NewJFrame();
                //j.setBounds(250, 0, 1000, 1000);
                j.setExtendedState(JFrame.MAXIMIZED_BOTH);
                j.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane AssemblyCodeBox;
    private javax.swing.JTextArea codeText;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
