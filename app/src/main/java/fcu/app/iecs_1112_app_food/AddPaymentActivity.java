package fcu.app.iecs_1112_app_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AddPaymentActivity extends PageBarButton {
    private ImageButton ibRet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutId(R.layout.activity_add_payment);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_payment);
        setPageBarBtnClickListener(AddPaymentActivity.this);
        getSupportActionBar().hide();

        ibRet = findViewById(R.id.img_btn_return);

        View.OnClickListener ibListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };

        ibRet.setOnClickListener(ibListener);
    }
}