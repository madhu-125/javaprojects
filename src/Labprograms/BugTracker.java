package Labprograms;

public class BugTracker {
	int Bugid = 101;
	String Application_Name;
	String BugTitle;
	String Severity;
	String priority;
	String Status;
	String assignTodeveloper;
	String Upadte;

	int getbugid() {
		return Bugid;

	}

	String getApplication_Name() {
		return Application_Name;
	}

	String getBugtitle() {

		return BugTitle;
	}

	String getSeverity() {
		return Severity;
	}

	String getpriority() {
		return priority;
	}

	String getStatus() {
		return Status;
	}

	String getAssignToDveloper() {
		return assignTodeveloper;
	}

	void AssignToDevloper(int id, String Devloper_name) {
		if (this.Bugid == id) {
			this.assignTodeveloper = Devloper_name;
		}
		Upadte("In Development");
	}

	void Upadte(String newUpdate) {
		this.Upadte = newUpdate;
		System.out.println("Bug Updating : " + newUpdate);
	}
	void displayBugdetails() {
		
		System.out.println("BugId : "+ getbugid());
		System.out.println("Apllication Name : "+ getApplication_Name());
		System.out.println("Bug Title : "+ getBugtitle());
		System.out.println("Severity : " + getSeverity());
		System.out.println("Priority : "+ getpriority());
		System.out.println(" Status : "+ getStatus());
		System.out.println("Assign To The Developer : "+ getAssignToDveloper());
	}


	public static void main(String[] args) {
		BugTracker bt = new BugTracker();
		bt.Bugid = 101;
		bt.Application_Name = "Banking Application";
		bt.BugTitle = "ATM";
		bt.Severity = "hard";
		bt.priority = "low";
		bt.Status = "open";
		bt.assignTodeveloper = "Madhu";
		
		bt.displayBugdetails();
		bt.AssignToDevloper(101, "");
		
	}

}
