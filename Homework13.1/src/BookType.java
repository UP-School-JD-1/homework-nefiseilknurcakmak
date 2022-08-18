
public enum BookType {
	fiction("The type of book is fiction"), scientific("The type of book is scientific."), romance("The type of book is romance"), classics("The type of book is classics");

	private String description;

    private BookType(String description)  {
        this.description = description;
		
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

  

}