package com.example.user.appchicago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = findViewById(R.id.imageButton);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);
        ImageButton imageButton10 = findViewById(R.id.imageButton10);
        ImageButton imageButton11 = findViewById(R.id.imageButton11);
        ImageButton imageButton12 = findViewById(R.id.imageButton12);
        ImageButton imageButton13 = findViewById(R.id.imageButton13);
        ImageButton imageButton14 = findViewById(R.id.imageButton14);
        ImageButton imageButton15 = findViewById(R.id.imageButton15);
        ImageButton imageButton16 = findViewById(R.id.imageButton16);
        ImageButton imageButton17 = findViewById(R.id.imageButton17);
        ImageButton imageButton18 = findViewById(R.id.imageButton18);
        ImageButton imageButton19 = findViewById(R.id.imageButton19);
        ImageButton imageButton20 = findViewById(R.id.imageButton20);
        ImageButton imageButton21 = findViewById(R.id.imageButton21);
        ImageButton imageButton22 = findViewById(R.id.imageButton22);
        ImageButton imageButton23 = findViewById(R.id.imageButton23);
        ImageButton imageButton24 = findViewById(R.id.imageButton24);
        ImageButton imageButton25 = findViewById(R.id.imageButton25);
        ImageButton imageButton26 = findViewById(R.id.imageButton26);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);
        imageButton10.setOnClickListener(this);
        imageButton11.setOnClickListener(this);
        imageButton12.setOnClickListener(this);
        imageButton13.setOnClickListener(this);
        imageButton14.setOnClickListener(this);
        imageButton15.setOnClickListener(this);
        imageButton16.setOnClickListener(this);
        imageButton17.setOnClickListener(this);
        imageButton18.setOnClickListener(this);
        imageButton19.setOnClickListener(this);
        imageButton20.setOnClickListener(this);
        imageButton21.setOnClickListener(this);
        imageButton22.setOnClickListener(this);
        imageButton23.setOnClickListener(this);
        imageButton24.setOnClickListener(this);
        imageButton25.setOnClickListener(this);
        imageButton26.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //Авто-Мото
            case R.id.imageButton:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/avto");
                startActivity(intent);
                break;
            //Бытовые услуги
            case R.id.imageButton2:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/uslugi");
                startActivity(intent);
                break;
            //Все для дома
            case R.id.imageButton3:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/vse-dlya-doma");
                startActivity(intent);
                break;
            //Грузоперевозки
            case R.id.imageButton4:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/gruzoperevozki");
                startActivity(intent);
                break;
            //Здоровье и медицина
            case R.id.imageButton5:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/meditsina");
                startActivity(intent);
                break;
            //Интернет и ТВ провайдеры
            case R.id.imageButton6:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/internet-i-tv-provaydery");
                startActivity(intent);
                break;
            //Искусство и развлечения
            case R.id.imageButton7:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/iskusstvo-i-razvlecheniya");
                startActivity(intent);
                break;
            //Компьютеры и сайты
            case R.id.imageButton8:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/obsluzhivaniye-i-remont-kompyuterov");
                startActivity(intent);
                break;
            //Красота и уход
            case R.id.imageButton9:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/krasota-i-ukhod-za-soboy");
                startActivity(intent);
                break;
            //Магазины
            case R.id.imageButton10:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/magaziny");
                startActivity(intent);
                break;
            //Недвижимость
            case R.id.imageButton11:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/nedvizhimost");
                startActivity(intent);
                break;
            //Обучение
            case R.id.imageButton12:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/obucheniye");
                startActivity(intent);
                break;
            //Общественные организации
            case R.id.imageButton13:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/religioznyye-organizatsii");
                startActivity(intent);
                break;
            //Отдых
            case R.id.imageButton14:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/otdykh");
                startActivity(intent);
                break;
            //Оформление/перевод документов
            case R.id.imageButton15:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/oformleniye-dokumentov");
                startActivity(intent);
                break;
            //Продукты
            case R.id.imageButton16:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/produkty");
                startActivity(intent);
                break;
            //Путишествия
            case R.id.imageButton17:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/puteshestviya");
                startActivity(intent);
                break;
            //Рестораны
            case R.id.imageButton18:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/restorany");
                startActivity(intent);
                break;
            //Страхование
            case R.id.imageButton19:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/strakhovka");
                startActivity(intent);
                break;
            //Товары и услуги для животных
            case R.id.imageButton20:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/tovary-i-uslugi-dlya-zhivotnykh");
                startActivity(intent);
                break;
            //Требуются
            case R.id.imageButton21:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/trebuyutsya");
                startActivity(intent);
                break;
            //Требуются водители траков
            case R.id.imageButton22:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/trebuyutsya-na-rabotu");
                startActivity(intent);
                break;
            //Финансы
            case R.id.imageButton23:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/advokatyfinansy");
                startActivity(intent);
                break;
            //Экстрасенсы, астрологи
            case R.id.imageButton24:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/ekstrasensy");
                startActivity(intent);
                break;
            //Юристы адвокаты
            case R.id.imageButton25:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/yuristy-advokaty");
                startActivity(intent);
                break;
            //Яхты
            case R.id.imageButton26:
                intent = new Intent(MainActivity.this, ListAdapterActivity.class);
                intent.putExtra("URL","http://api.7days.us/v1/chicago/get-companies-by-cat/yakhty");
                startActivity(intent);
                break;
        }
    }
}
