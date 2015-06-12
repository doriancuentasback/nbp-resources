Table table {
    title="Squares";
    rows=5;
    Border border {
        padding=2;
        weight=1;
    }
    Column {
        heading="x";
        width=10;
        String content(Natural row) {
            return row.string;
        }
    },
    Column {
        heading="x**2";
        width=10;
        String content(Natural row) {
            return (row**2).string;
        }
    }
}