for (int i = 0; i < bookList.length; i++) {
        System.out.printf("|| %-3d || %-13s || %-14s || %-15s || %-10s || %-5d ||%n",
                          i + 1, bookList[i].getBookId(), bookList[i].getTitle(),
bookList[i].getAuthor(), bookList[i].getCategory(), bookList[i].getStock());
        }
