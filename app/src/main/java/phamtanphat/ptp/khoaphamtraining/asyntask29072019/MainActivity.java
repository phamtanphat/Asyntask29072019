package phamtanphat.ptp.khoaphamtraining.asyntask29072019;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView mtxtExcuteAsyntask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxtExcuteAsyntask = findViewById(R.id.textview);

        mtxtExcuteAsyntask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Moi chuoi se cach nhau ra 1 s
                // Bat dau cong viec
                // Thuc thi cong viec 1
                // Thuc thi cong viec 2
                // Thuc thi cong viec 3
                // Ket thuc qua trinh
            }
        });
    }
    // params : gia tri truyen vao cho phan xu ly logic
    // progress : gia tri khi xu ly logic no ban ra cho onProgressUpdate
    // result : khi thuc thi xong luong tra ve gi thi truyen qua cho onPostexcute
    class Xulydatientrinh extends AsyncTask<String,String,Character> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        // Day la 1 luong ben ngoai de xu ly logic
        @Override
        protected Character doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Character character) {
            super.onPostExecute(character);
        }
    }
}
