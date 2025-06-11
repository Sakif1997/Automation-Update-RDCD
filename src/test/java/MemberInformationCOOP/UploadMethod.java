
	package MemberInformationCOOP;

	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.awt.datatransfer.StringSelection;
	import java.awt.*;

	public class UploadMethod {
		//String filePath = "path/to/your/image/file.jpg";

	    // Place file path in clipboard
		public static void Upload(String filePath) throws AWTException {
	    StringSelection stringSelection = new StringSelection(filePath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

	    // Create Robot instance
	    Robot robot = new Robot();

	    // Paste the file path into the file name field
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);

	    // Press Enter to confirm file selection
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}
	}
