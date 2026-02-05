package snakerunner.graphics.panel;

import snakerunner.graphics.MainFrame;

public final class PanelFactory {

    private PanelFactory(){}

    public static GamePanel createGamePanel(final MainFrame mainFrame) {
        return new GamePanel(mainFrame);
    }

    public static MenuPanel createMenuPanel(final MainFrame mainFrame) {
        return new MenuPanel(mainFrame);
    }

    public static OptionPanel createOptionPanel(final MainFrame mainFrame) {
        return new OptionPanel(mainFrame);
    }
}
