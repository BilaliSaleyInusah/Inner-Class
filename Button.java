public class Button {
    private String title;
    private OnclickListener onclickListener;

    public Button (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnclickListener(OnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }

    public void onClick(){
        this.onclickListener.onClick(this.title);
    }

    // interface 
    public interface OnclickListener {
        public void onClick(String title);
    }

}
