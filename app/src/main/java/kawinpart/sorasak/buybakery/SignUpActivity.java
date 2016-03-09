package kawinpart.sorasak.buybakery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passwordEditText, IdCardEditText;
    private String nameString, userString, passwordString, IdCardString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();



    } //Main Method

    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        IdCardString = IdCardEditText.getText().toString().trim();

        // Check Space
        if (checkspace()) {

        } else {
        }

    } // clickSignUp

    private boolean checkspace() {

        boolean result = true;
        result = nameString.equals("") || userString.equals("") ||
                passwordString.equals("") || IdCardString.equals("");
        return result;
    }


    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        IdCardEditText = (EditText) findViewById(R.id.editText4);
    }


} //Main Class
