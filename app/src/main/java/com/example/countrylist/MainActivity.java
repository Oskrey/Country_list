package com.example.countrylist;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Сан-Марино", "Сан-Марино","61,2 км²","34 010", R.drawable.flag_of_san_marino));
        states.add(new State ("Эфиопия", "Аддис-Абеба","1 112 000 км²","117,9 миллиона", R.drawable.flag_of_ethiopia));
        states.add(new State ("Ангилья", "Валли","102 км²","15 094", R.drawable.flag_of_anguilla));
        states.add(new State ("Фарерские острова", "Торсхавн","1 393 км²","49 053", R.drawable.flag_of_the_faroe_islands));
        states.add(new State ("Таджикистан", "Душанбе","141 400 км²","9,75 миллиона", R.drawable.flag_of_tajikistan));

        states.add(new State ("Гондурас", "Тегусигальпа","112 492 км²","10,06 миллиона ", R.drawable.flag_of_honduras));
        states.add(new State ("Бразилия", "Бразилиа","8 516 000 км²","214 миллионов", R.drawable.flag_of_brazil));
        states.add(new State ("Афганистан", "Кабул","652 860 км²","39,84 миллиона", R.drawable.flag_of_afghanistan));
        states.add(new State ("Израиль", "Иерусалим","22 145 км²","9,364 миллиона", R.drawable.flag_of_israel));
        states.add(new State ("Катар", "Доха","11 571 км²", "2,931 миллиона", R.drawable.flag_of_qatar));
    }
}