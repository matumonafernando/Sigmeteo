/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author INAMETCLIN-3
 */
public class form_hourlywind {
  private String stationld;
  private int yyyy;
  private int mm;
  private int dd;  
  
private String elem_112_00;
private   String elem_112_01;
private   String elem_112_02;
private   String elem_112_03;
private   String elem_112_04;
private   String elem_112_05;
private   String elem_112_06;
private   String elem_112_07;
private   String elem_112_08;
private   String elem_112_09;
private   String elem_112_10;
private   String elem_112_11;
private   String elem_112_12;
private   String elem_112_13;
private   String elem_112_14;
private   String elem_112_15;
private   String elem_112_16;
private   String elem_112_17;
private   String elem_112_18;
private   String elem_112_19;
private   String elem_112_20;
private   String elem_112_21;
private   String elem_112_22;
private   String elem_112_23;

private String ddflag00;
private String ddflag01;
private String ddflag02;
private String ddflag03;
private String ddflag04;
private String ddflag05;
private String ddflag06;
private String ddflag07;
private String ddflag08;
private String ddflag09;
private String ddflag10;
private String ddflag11;
private String ddflag12;
private String ddflag13;
private String ddflag14;
private String ddflag15;
private String ddflag16;
private String ddflag17;
private String ddflag18;
private String ddflag19;
private String ddflag20;
private String ddflag21;
private String ddflag22;
private String ddflag23;

private   String elem_111_00;         
private   String elem_111_01;
private   String elem_111_02;
private   String elem_111_03;
private   String elem_111_04;
private   String elem_111_05;
private   String elem_111_06;
private   String elem_111_07;
private   String elem_111_08;
private   String elem_111_09;
private   String elem_111_10;
private   String elem_111_11;
private   String elem_111_12;
private   String elem_111_13;
private   String elem_111_14;
private   String elem_111_15;
private   String elem_111_16;
private   String elem_111_17;
private   String elem_111_19;
private   String elem_111_20;
private   String elem_111_21;
private   String elem_111_22;
private   String elem_111_23;

  private String total;
  private String signature;
  private int entryDatetime;

//construtores
    public form_hourlywind(String stationld, int yyyy, int mm, int dd, String elem_112_00, String elem_112_01, String elem_112_02, String elem_112_03, String elem_112_04, String elem_112_05, String elem_112_06, String elem_112_07, String elem_112_08, String elem_112_09, String elem_112_10, String elem_112_11, String elem_112_12, String elem_112_13, String elem_112_14, String elem_112_15, String elem_112_16, String elem_112_17, String elem_112_18, String elem_112_19, String elem_112_20, String elem_112_21, String elem_112_22, String elem_112_23, String ddflag00, String ddflag01, String ddflag02, String ddflag03, String ddflag04, String ddflag05, String ddflag06, String ddflag07, String ddflag08, String ddflag09, String ddflag10, String ddflag11, String ddflag12, String ddflag13, String ddflag14, String ddflag15, String ddflag16, String ddflag17, String ddflag18, String ddflag19, String ddflag20, String ddflag21, String ddflag22, String ddflag23, String elem_111_00, String elem_111_01, String elem_111_02, String elem_111_03, String elem_111_04, String elem_111_05, String elem_111_06, String elem_111_07, String elem_111_08, String elem_111_09, String elem_111_10, String elem_111_11, String elem_111_12, String elem_111_13, String elem_111_14, String elem_111_15, String elem_111_16, String elem_111_17, String elem_111_19, String elem_111_20, String elem_111_21, String elem_111_22, String elem_111_23, String total, String signature, int entryDatetime) {  
        this.stationld = stationld;
        this.yyyy = yyyy;
        this.mm = mm;
        this.dd = dd;
        this.elem_112_00 = elem_112_00;
        this.elem_112_01 = elem_112_01;
        this.elem_112_02 = elem_112_02;
        this.elem_112_03 = elem_112_03;
        this.elem_112_04 = elem_112_04;
        this.elem_112_05 = elem_112_05;
        this.elem_112_06 = elem_112_06;
        this.elem_112_07 = elem_112_07;
        this.elem_112_08 = elem_112_08;
        this.elem_112_09 = elem_112_09;
        this.elem_112_10 = elem_112_10;
        this.elem_112_11 = elem_112_11;
        this.elem_112_12 = elem_112_12;
        this.elem_112_13 = elem_112_13;
        this.elem_112_14 = elem_112_14;
        this.elem_112_15 = elem_112_15;
        this.elem_112_16 = elem_112_16;
        this.elem_112_17 = elem_112_17;
        this.elem_112_18 = elem_112_18;
        this.elem_112_19 = elem_112_19;
        this.elem_112_20 = elem_112_20;
        this.elem_112_21 = elem_112_21;
        this.elem_112_22 = elem_112_22;
        this.elem_112_23 = elem_112_23;
        this.ddflag00 = ddflag00;
        this.ddflag01 = ddflag01;
        this.ddflag02 = ddflag02;
        this.ddflag03 = ddflag03;
        this.ddflag04 = ddflag04;
        this.ddflag05 = ddflag05;
        this.ddflag06 = ddflag06;
        this.ddflag07 = ddflag07;
        this.ddflag08 = ddflag08;
        this.ddflag09 = ddflag09;
        this.ddflag10 = ddflag10;
        this.ddflag11 = ddflag11;
        this.ddflag12 = ddflag12;
        this.ddflag13 = ddflag13;
        this.ddflag14 = ddflag14;
        this.ddflag15 = ddflag15;
        this.ddflag16 = ddflag16;
        this.ddflag17 = ddflag17;
        this.ddflag18 = ddflag18;
        this.ddflag19 = ddflag19;
        this.ddflag20 = ddflag20;
        this.ddflag21 = ddflag21;
        this.ddflag22 = ddflag22;
        this.ddflag23 = ddflag23;
        this.elem_111_00 = elem_111_00;
        this.elem_111_01 = elem_111_01;
        this.elem_111_02 = elem_111_02;
        this.elem_111_03 = elem_111_03;
        this.elem_111_04 = elem_111_04;
        this.elem_111_05 = elem_111_05;
        this.elem_111_06 = elem_111_06;
        this.elem_111_07 = elem_111_07;
        this.elem_111_08 = elem_111_08;
        this.elem_111_09 = elem_111_09;
        this.elem_111_10 = elem_111_10;
        this.elem_111_11 = elem_111_11;
        this.elem_111_12 = elem_111_12;
        this.elem_111_13 = elem_111_13;
        this.elem_111_14 = elem_111_14;
        this.elem_111_15 = elem_111_15;
        this.elem_111_16 = elem_111_16;
        this.elem_111_17 = elem_111_17;
        this.elem_111_19 = elem_111_19;
        this.elem_111_20 = elem_111_20;
        this.elem_111_21 = elem_111_21;
        this.elem_111_22 = elem_111_22;
        this.elem_111_23 = elem_111_23;
        this.total = total;
        this.signature = signature;
        this.entryDatetime = entryDatetime;
    }

//comando get e set
    public String getStationld() {
        return stationld;
    }

    public void setStationld(String stationld) {
        this.stationld = stationld;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public String getElem_112_00() {
        return elem_112_00;
    }

    public void setElem_112_00(String elem_112_00) {
        this.elem_112_00 = elem_112_00;
    }

    public String getElem_112_01() {
        return elem_112_01;
    }

    public void setElem_112_01(String elem_112_01) {
        this.elem_112_01 = elem_112_01;
    }

    public String getElem_112_02() {
        return elem_112_02;
    }

    public void setElem_112_02(String elem_112_02) {
        this.elem_112_02 = elem_112_02;
    }

    public String getElem_112_03() {
        return elem_112_03;
    }

    public void setElem_112_03(String elem_112_03) {
        this.elem_112_03 = elem_112_03;
    }

    public String getElem_112_04() {
        return elem_112_04;
    }

    public void setElem_112_04(String elem_112_04) {
        this.elem_112_04 = elem_112_04;
    }

    public String getElem_112_05() {
        return elem_112_05;
    }

    public void setElem_112_05(String elem_112_05) {
        this.elem_112_05 = elem_112_05;
    }

    public String getElem_112_06() {
        return elem_112_06;
    }

    public void setElem_112_06(String elem_112_06) {
        this.elem_112_06 = elem_112_06;
    }

    public String getElem_112_07() {
        return elem_112_07;
    }

    public void setElem_112_07(String elem_112_07) {
        this.elem_112_07 = elem_112_07;
    }

    public String getElem_112_08() {
        return elem_112_08;
    }

    public void setElem_112_08(String elem_112_08) {
        this.elem_112_08 = elem_112_08;
    }

    public String getElem_112_09() {
        return elem_112_09;
    }

    public void setElem_112_09(String elem_112_09) {
        this.elem_112_09 = elem_112_09;
    }

    public String getElem_112_10() {
        return elem_112_10;
    }

    public void setElem_112_10(String elem_112_10) {
        this.elem_112_10 = elem_112_10;
    }

    public String getElem_112_11() {
        return elem_112_11;
    }

    public void setElem_112_11(String elem_112_11) {
        this.elem_112_11 = elem_112_11;
    }

    public String getElem_112_12() {
        return elem_112_12;
    }

    public void setElem_112_12(String elem_112_12) {
        this.elem_112_12 = elem_112_12;
    }

    public String getElem_112_13() {
        return elem_112_13;
    }

    public void setElem_112_13(String elem_112_13) {
        this.elem_112_13 = elem_112_13;
    }

    public String getElem_112_14() {
        return elem_112_14;
    }

    public void setElem_112_14(String elem_112_14) {
        this.elem_112_14 = elem_112_14;
    }

    public String getElem_112_15() {
        return elem_112_15;
    }

    public void setElem_112_15(String elem_112_15) {
        this.elem_112_15 = elem_112_15;
    }

    public String getElem_112_16() {
        return elem_112_16;
    }

    public void setElem_112_16(String elem_112_16) {
        this.elem_112_16 = elem_112_16;
    }

    public String getElem_112_17() {
        return elem_112_17;
    }

    public void setElem_112_17(String elem_112_17) {
        this.elem_112_17 = elem_112_17;
    }

    public String getElem_112_18() {
        return elem_112_18;
    }

    public void setElem_112_18(String elem_112_18) {
        this.elem_112_18 = elem_112_18;
    }

    public String getElem_112_19() {
        return elem_112_19;
    }

    public void setElem_112_19(String elem_112_19) {
        this.elem_112_19 = elem_112_19;
    }

    public String getElem_112_20() {
        return elem_112_20;
    }

    public void setElem_112_20(String elem_112_20) {
        this.elem_112_20 = elem_112_20;
    }

    public String getElem_112_21() {
        return elem_112_21;
    }

    public void setElem_112_21(String elem_112_21) {
        this.elem_112_21 = elem_112_21;
    }

    public String getElem_112_22() {
        return elem_112_22;
    }

    public void setElem_112_22(String elem_112_22) {
        this.elem_112_22 = elem_112_22;
    }

    public String getElem_112_23() {
        return elem_112_23;
    }

    public void setElem_112_23(String elem_112_23) {
        this.elem_112_23 = elem_112_23;
    }

    public String getDdflag00() {
        return ddflag00;
    }

    public void setDdflag00(String ddflag00) {
        this.ddflag00 = ddflag00;
    }

    public String getDdflag01() {
        return ddflag01;
    }

    public void setDdflag01(String ddflag01) {
        this.ddflag01 = ddflag01;
    }

    public String getDdflag02() {
        return ddflag02;
    }

    public void setDdflag02(String ddflag02) {
        this.ddflag02 = ddflag02;
    }

    public String getDdflag03() {
        return ddflag03;
    }

    public void setDdflag03(String ddflag03) {
        this.ddflag03 = ddflag03;
    }

    public String getDdflag04() {
        return ddflag04;
    }

    public void setDdflag04(String ddflag04) {
        this.ddflag04 = ddflag04;
    }

    public String getDdflag05() {
        return ddflag05;
    }

    public void setDdflag05(String ddflag05) {
        this.ddflag05 = ddflag05;
    }

    public String getDdflag06() {
        return ddflag06;
    }

    public void setDdflag06(String ddflag06) {
        this.ddflag06 = ddflag06;
    }

    public String getDdflag07() {
        return ddflag07;
    }

    public void setDdflag07(String ddflag07) {
        this.ddflag07 = ddflag07;
    }

    public String getDdflag08() {
        return ddflag08;
    }

    public void setDdflag08(String ddflag08) {
        this.ddflag08 = ddflag08;
    }

    public String getDdflag09() {
        return ddflag09;
    }

    public void setDdflag09(String ddflag09) {
        this.ddflag09 = ddflag09;
    }

    public String getDdflag10() {
        return ddflag10;
    }

    public void setDdflag10(String ddflag10) {
        this.ddflag10 = ddflag10;
    }

    public String getDdflag11() {
        return ddflag11;
    }

    public void setDdflag11(String ddflag11) {
        this.ddflag11 = ddflag11;
    }

    public String getDdflag12() {
        return ddflag12;
    }

    public void setDdflag12(String ddflag12) {
        this.ddflag12 = ddflag12;
    }

    public String getDdflag13() {
        return ddflag13;
    }

    public void setDdflag13(String ddflag13) {
        this.ddflag13 = ddflag13;
    }

    public String getDdflag14() {
        return ddflag14;
    }

    public void setDdflag14(String ddflag14) {
        this.ddflag14 = ddflag14;
    }

    public String getDdflag15() {
        return ddflag15;
    }

    public void setDdflag15(String ddflag15) {
        this.ddflag15 = ddflag15;
    }

    public String getDdflag16() {
        return ddflag16;
    }

    public void setDdflag16(String ddflag16) {
        this.ddflag16 = ddflag16;
    }

    public String getDdflag17() {
        return ddflag17;
    }

    public void setDdflag17(String ddflag17) {
        this.ddflag17 = ddflag17;
    }

    public String getDdflag18() {
        return ddflag18;
    }

    public void setDdflag18(String ddflag18) {
        this.ddflag18 = ddflag18;
    }

    public String getDdflag19() {
        return ddflag19;
    }

    public void setDdflag19(String ddflag19) {
        this.ddflag19 = ddflag19;
    }

    public String getDdflag20() {
        return ddflag20;
    }

    public void setDdflag20(String ddflag20) {
        this.ddflag20 = ddflag20;
    }

    public String getDdflag21() {
        return ddflag21;
    }

    public void setDdflag21(String ddflag21) {
        this.ddflag21 = ddflag21;
    }

    public String getDdflag22() {
        return ddflag22;
    }

    public void setDdflag22(String ddflag22) {
        this.ddflag22 = ddflag22;
    }

    public String getDdflag23() {
        return ddflag23;
    }

    public void setDdflag23(String ddflag23) {
        this.ddflag23 = ddflag23;
    }

    public String getElem_111_00() {
        return elem_111_00;
    }

    public void setElem_111_00(String elem_111_00) {
        this.elem_111_00 = elem_111_00;
    }

    public String getElem_111_01() {
        return elem_111_01;
    }

    public void setElem_111_01(String elem_111_01) {
        this.elem_111_01 = elem_111_01;
    }

    public String getElem_111_02() {
        return elem_111_02;
    }

    public void setElem_111_02(String elem_111_02) {
        this.elem_111_02 = elem_111_02;
    }

    public String getElem_111_03() {
        return elem_111_03;
    }

    public void setElem_111_03(String elem_111_03) {
        this.elem_111_03 = elem_111_03;
    }

    public String getElem_111_04() {
        return elem_111_04;
    }

    public void setElem_111_04(String elem_111_04) {
        this.elem_111_04 = elem_111_04;
    }

    public String getElem_111_05() {
        return elem_111_05;
    }

    public void setElem_111_05(String elem_111_05) {
        this.elem_111_05 = elem_111_05;
    }

    public String getElem_111_06() {
        return elem_111_06;
    }

    public void setElem_111_06(String elem_111_06) {
        this.elem_111_06 = elem_111_06;
    }

    public String getElem_111_07() {
        return elem_111_07;
    }

    public void setElem_111_07(String elem_111_07) {
        this.elem_111_07 = elem_111_07;
    }

    public String getElem_111_08() {
        return elem_111_08;
    }

    public void setElem_111_08(String elem_111_08) {
        this.elem_111_08 = elem_111_08;
    }

    public String getElem_111_09() {
        return elem_111_09;
    }

    public void setElem_111_09(String elem_111_09) {
        this.elem_111_09 = elem_111_09;
    }

    public String getElem_111_10() {
        return elem_111_10;
    }

    public void setElem_111_10(String elem_111_10) {
        this.elem_111_10 = elem_111_10;
    }

    public String getElem_111_11() {
        return elem_111_11;
    }

    public void setElem_111_11(String elem_111_11) {
        this.elem_111_11 = elem_111_11;
    }

    public String getElem_111_12() {
        return elem_111_12;
    }

    public void setElem_111_12(String elem_111_12) {
        this.elem_111_12 = elem_111_12;
    }

    public String getElem_111_13() {
        return elem_111_13;
    }

    public void setElem_111_13(String elem_111_13) {
        this.elem_111_13 = elem_111_13;
    }

    public String getElem_111_14() {
        return elem_111_14;
    }

    public void setElem_111_14(String elem_111_14) {
        this.elem_111_14 = elem_111_14;
    }

    public String getElem_111_15() {
        return elem_111_15;
    }

    public void setElem_111_15(String elem_111_15) {
        this.elem_111_15 = elem_111_15;
    }

    public String getElem_111_16() {
        return elem_111_16;
    }

    public void setElem_111_16(String elem_111_16) {
        this.elem_111_16 = elem_111_16;
    }

    public String getElem_111_17() {
        return elem_111_17;
    }

    public void setElem_111_17(String elem_111_17) {
        this.elem_111_17 = elem_111_17;
    }

    public String getElem_111_19() {
        return elem_111_19;
    }

    public void setElem_111_19(String elem_111_19) {
        this.elem_111_19 = elem_111_19;
    }

    public String getElem_111_20() {
        return elem_111_20;
    }

    public void setElem_111_20(String elem_111_20) {
        this.elem_111_20 = elem_111_20;
    }

    public String getElem_111_21() {
        return elem_111_21;
    }

    public void setElem_111_21(String elem_111_21) {
        this.elem_111_21 = elem_111_21;
    }

    public String getElem_111_22() {
        return elem_111_22;
    }

    public void setElem_111_22(String elem_111_22) {
        this.elem_111_22 = elem_111_22;
    }

    public String getElem_111_23() {
        return elem_111_23;
    }

    public void setElem_111_23(String elem_111_23) {
        this.elem_111_23 = elem_111_23;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(int entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

}
