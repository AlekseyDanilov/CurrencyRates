package ru.alekseydanilov.currencyrates.popup;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import ru.alekseydanilov.currencyrates.R;

public class CustomPopUp extends PopupWindow {

    /**
     * Метод для отображения окна popUp с ошибкой
     *
     * @param activity - activity, в которой мы работаем
     * @param parent   - view представление, внутри которого мы отображаем popUP
     */
    public void showFailedPopUp(Activity activity, View parent, String message) {
        LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = layoutInflater.inflate(R.layout.popup_layout, null);

        ImageView image = customView.findViewById(R.id.imagePopUp);
        ImageButton closeBtn = customView.findViewById(R.id.close_popup_btn);
        TextView headerText = customView.findViewById(R.id.header_popup);

        /*
         * Определям размер popup
         */
        PopupWindow popupWindow = new PopupWindow(customView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setElevation(15);
        popupWindow.update();

        // Отображаем окно popup
        try {
            popupWindow.showAtLocation(parent, Gravity.CENTER, 0, 0);
        } catch (WindowManager.BadTokenException ignored) {
        }

        image.setImageResource(R.drawable.error);
        if (message == null) {
            headerText.setText("Ошибка!\n Возникла неизвестная ошибка");
        } else {
            headerText.setText("Ошибка!\n".concat(message));
        }

        // Кнопка закрытия popUp
        closeBtn.setOnClickListener(v -> {
            popupWindow.dismiss();
        });
    }
}
