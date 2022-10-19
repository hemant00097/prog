class Q47 {
     String name, id, Strm;

    public Q47(String name, String id, String Strm) {
        this.name = name;
        this.id = id;
        this.Strm = Strm;
    }

    @Override
    public String toString() 
    {
        return name+" "+id+" "+Strm;
    }

    public static void main(String[] args) {
        Q47 s = new Q47("Name", "id", "Strm");
        System.out.print(s);
    }
}
