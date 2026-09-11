package composition;

public class driver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo_1");

        Folder sourcefiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.add_Folder(sourcefiles);
        phpDemo1.add_Folder(includePath);
        phpDemo1.add_Folder(remoteFiles);

        Folder phalcon = new Folder("phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourcefiles.add_Folder(phalcon);
        sourcefiles.add_Folder(app);
        sourcefiles.add_Folder(cache);
        sourcefiles.add_Folder(publicFolder);

        app.add_Folder(new Folder("config"));
        app.add_Folder(new Folder("controls"));
        app.add_Folder(new Folder("library"));
        app.add_Folder(new Folder("migrations"));
        app.add_Folder(new Folder("models"));
        app.add_Folder(new Folder("views"));

        publicFolder.add_File(new File(".htaccess","htaccess"));
        publicFolder.add_File(new File(".htrouter.php","php"));
        publicFolder.add_File(new File("index.html","html"));

        phpDemo1.print();

        System.out.println("Structure after deleting App Folder");

        phpDemo1.deleteSubFolder("app");
        phpDemo1.print();

        System.out.println("Structure after deleting Public Folder");

        phpDemo1.deleteSubFolder("public");
        phpDemo1.print();
    }
}
