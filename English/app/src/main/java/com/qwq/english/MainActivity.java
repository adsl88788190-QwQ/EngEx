package com.qwq.english;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    // List view
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;
    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    String products[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, products);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
                ListView listView = (ListView) arg0;
                getAlertDialog("Word",listView.getItemAtPosition(arg2).toString()).show();

            }
        });
        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                MainActivity.this.adapter.getFilter().filter(cs);
            }
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,int arg3) {
                // TODO Auto-generated method stub
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }
    private AlertDialog getAlertDialog(String title,String message){
        //產生一個Builder物件
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //設定Dialog的標題
        builder.setTitle(title);
        //設定Dialog的內容
        builder.setMessage(message);
        //設定Positive按鈕資料
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        //利用Builder物件建立AlertDialog
        return builder.create();
    }
    ArrayList<String> Title = new ArrayList<>();
    public void setData(){
        ArrayList<String> al = new ArrayList<>();
        //C Start
        al.add("This region is well known for its rich dairy products.");
        al.add("The failure of the experiment dashed his spirits.");
        al.add("He was dazed by a heavy blow on his head.");
        al.add("Fog on sea is sailor's deadliest enemy.");
        al.add("What made the Roman Empire decay is at present eating away the vigor of this regime.");
        al.add("The deceased should be left in peace.");
        al.add("Never deceive under any circumstances.");
        al.add("Frank has tried to deduce his lineage by looking through the various documents.");
        al.add("The teacher deducted some marks for bad handwriting.");
        al.add("We used to deem very highly of the director.");
        al.add("He has some defect in eyesight.");
        al.add("He was deficient in courage.");
        al.add("Reading immoral books could easily defile the mind.");
        al.add("You will be sent to the prison, if you defy the law.");
        al.add("His health degenerated rapidly after the accident.");
        al.add("Ten names were deleted from the list of those invited to attend the conference.");
        al.add("With deliberate effort the poet succeeded in presenting a better poetic effect");
        al.add("The tiny flowers are delicate.");
        al.add("If a foreign object becomes deposited in the eye, medical help is necessary.");
        al.add("The depression in the United States lasted until the beginning of the Second World War.");
        al.add("Mr.Cloude will be my deputy during my absence.");
        al.add("Those who enjoy reading know how to derive pleasure from it.");
        al.add("He descended to an inferior position.");
        al.add("The bum was despised by most of his neighbors around the bus station.");
        al.add("The convicts devised a plan to escape from prison.");
        al.add("The doctor diagnosed the illness as pneumonia.");
        al.add("The dialogue in the novel is poorly written.");
        al.add("The author's diction was noted for its freshness and vividness.");
        al.add("Cultural traits are able to diffuse apart from the migration of peoples.");
        al.add("Some foods are digested more easily than others.");
        al.add("The pupil of the human eye dilates when the level of light is low.");
        al.add("What are the dimensions of this chamber?");
        al.add("The cost of production is diminished because of the new project.");
        al.add("The library discarded all its old magazines.");
        al.add("The two answers are in discord, and they decide to ask him for the third time.");
        al.add("You must discount a great deal of what you read in the newspapers.");
        al.add("The professors were asked to discourse about the laws of nature.");
        al.add("A discredited theory will no longer be adopted.");
        al.add("Do not discriminate in favor of anyone.");
        al.add("A telegram was hastily dispatched to notify everyone concerned.");
        al.add("The protesting crowd dispersed after the rally.");
        al.add("The speech totally disrupted the meeting.");
        al.add("The facts were distorted during their presentation at court.");
        al.add("As I do not understand the subject, it is out of my domain.");
        al.add("The dominant theme is one of peace and tranquillity.");
        al.add("Everyone in the office donated some money to the Red Cross.");
        al.add("The doctor dosed the child with quinine and cured him.");
        al.add("Carol dozed off and couldn't be roused for hours.");
        al.add("Many pure metals have little use because they are too soft, rust too easily, or have come other drawback.");
        al.add("The severe drought ruined the wheat crop.");
        al.add("She drowsed, but did not quite fall asleep.");
        al.add("Marcia's career involved a dual role for her as a counselor and a teacher.");
        al.add("The two gentlemen dueled with each other for a solution of the problem.");
        al.add("We had duplicate keys for the front gate.");
        //D Start
        products = al.toArray(new String[al.size()]);
    }
}