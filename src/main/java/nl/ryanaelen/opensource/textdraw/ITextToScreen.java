package nl.ryanaelen.opensource.textdraw;

@FunctionalInterface
public interface ITextToScreen {
    void text(String text);

    default boolean checkIfNullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }
}

