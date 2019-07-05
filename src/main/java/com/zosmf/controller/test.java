package com.zosmf.controller;

public class test {

    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();
        String dsName = "AAA.BBB";

        sb.append("//ST01052 JOB (ACCT),'ST010',MSGCLASS=H,\n");
        sb.append("//      NOTIFY=ST010,CLASS=A,MSGLEVEL=(1,1),TIME=(0,10)\n");
        sb.append("//MYLIB    JCLLIB ORDER=SYS1.SACBCNTL\n");
        sb.append("//GENDCLST EXEC  ACBJBAOB,\n");
        sb.append("//         PLIB1=SYS1.DGTPLIB,\n");
        sb.append("//         TABL2=ST010.TEST.ISPTABL\n");
        sb.append("//SYSTSIN  DD    *\n");
        sb.append("PROFILE PREFIX(ST010)\n");
        sb.append("ISPSTART CMD(ACBQBAIC SAVE DCNAMES +\n");
        sb.append("SCDS('ST010.SMS1.SCDS') DATACLAS(");
        sb.append(dsName);
        sb.append("DCPDS)) +\n");
        sb.append("NEWAPPL(DGT) BATSCRW(132) BATSCRD(27) BREDIMAX(3) BDISPMAX(99999999)\n");
        sb.append("/*");
        //提交jcl的request

        System.out.println(sb.toString());
    }
}
