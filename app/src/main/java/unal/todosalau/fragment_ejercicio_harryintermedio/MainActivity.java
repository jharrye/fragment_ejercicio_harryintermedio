package unal.todosalau.fragment_ejercicio_harryintermedio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {//el activity se convierte en un contenedor de fragmentos
    //un activity es un cuaderno y las hojas son los fragmentos,
    // todo se reune en un solo cuaderno para no tener muchos activitys

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);//realizamos un casteo
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_hostfragmet);
        NavigationUI.setupWithNavController(
                bottomNavigationView,
                navHostFragment.getNavController()
                //aqui se agrego la logica directa para no crear un evento onclier,
                //se  logro al poner los nombres iguales en (nav_graph) con los nombre
                //que tiene (menu_nave_fragment) ejemplo:page_home
        );//minuto1;20 clase30-11-2023
    }
}
