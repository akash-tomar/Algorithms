package Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import lectures.input;



public class CV extends Applet implements ActionListener,ItemListener  {
	TextField firstname,lastname;
	Checkbox male,female,read,sing,dance,travel;
	CheckboxGroup cbg;
	Choice day,month,year;
	String msg=" ";
	
	public void init()
	{
		Label civi=new Label("Curriculum vitae",Label.CENTER);
		Label fname=new Label("First name:",Label.RIGHT);
		Label lname=new Label("Last name:",Label.RIGHT);
		Label gen=new Label("Gender:",Label.RIGHT);
		Label dob=new Label("Date Of Birth:",Label.RIGHT);
		Label hobby=new Label("Hobbies:",Label.RIGHT);

		firstname=new TextField(10);
		lastname=new TextField(10);

		cbg=new CheckboxGroup();
		male=new Checkbox("Male",cbg,true);
		female=new Checkbox("Female",cbg,false);

		read=new Checkbox("Reading",null,true);
		sing=new Checkbox("Singing");
		dance=new Checkbox("Dancing");
		travel=new Checkbox("Travel and adventure");

		day=new Choice();
		month=new Choice();
		year=new Choice();
		day.add("01");
		day.add("02");
		day.add("03");
		day.add("04");	
		day.add("05");
		day.add("06");
		day.add("07");
		day.add("08");
		day.add("09");
		day.add("10");
		day.add("11");
		day.add("12");
		day.add("13");
		day.add("14");
		day.add("15");
		day.add("16");
		day.add("17");
		day.add("18");
		day.add("19");
		day.add("20");
		day.add("21");
		day.add("22");
		day.add("23");
		day.add("24");		
		day.add("25");
		day.add("26");
		day.add("27");
		day.add("28");
		day.add("29");
		day.add("30");
		day.add("31");
		month.add("JAN");
		month.add("FEB");
		month.add("MAR");
		month.add("APR");
		month.add("MAY");
		month.add("JUN");
		month.add("JUL");
		month.add("AUG");
		month.add("SEP");
		month.add("OCT");
		month.add("NOV");
		month.add("DEC");
		year.add("1993");
		year.add("1994");
		year.add("1995");
		year.add("1996");
		year.add("1997");

		add(fname);
		add(firstname);
		add(lname);
		add(lastname);
		add(gen);
		add(male);
		add(female);
		add(dob);
		add(day);
		add(month);
		add(year);
		add(hobby);
		add(read);
		add(sing);
		add(dance);
		add(travel);
		
		firstname.addActionListener(this);
		lastname.addActionListener(this);
		male.addItemListener(this);
		female.addItemListener(this);
		day.addItemListener(this);
		month.addItemListener(this);
		year.addItemListener(this);
		read.addItemListener(this);
		sing.addItemListener(this);
		dance.addItemListener(this);
		travel.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Name:"+firstname.getText()+"  "+lastname.getText(),6,60);
		msg="Gender:";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,6,100);
		msg="Date Of Birth:"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
		g.drawString(msg,6,140);
		msg="Hobbies:";
		g.drawString(msg,6,180);
		msg="Reading:"+read.getState();
		g.drawString(msg,6,200);
		msg="singing:"+sing.getState();
		g.drawString(msg,6,220);
		msg="Dancing:"+dance.getState();
		g.drawString(msg,6,240);
		msg="Travel and adventure:"+travel.getState();
		g.drawString(msg,6,260);
	}

}
