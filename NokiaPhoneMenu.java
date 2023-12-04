import java.util.Scanner;

public class NokiaPhoneMenu {

	public static void main(String[] args) {

		Scanner numberDecoder = new Scanner(System.in);

			System.out.println("List of menu funtions");

			System.out.println("1. Phone book");
			System.out.println("2. Messages");
			System.out.println("3. Chat");
			System.out.println("4. Call register");
			System.out.println("5. Tones");
			System.out.println("6. Settings");
			System.out.println("7. Call divert");
			System.out.println("8. Games");
			System.out.println("9. Calculator");
			System.out.println("10. Reminders");
			System.out.println("11. Clock");
			System.out.println("12. Profiles");
			System.out.println("13. Sim services");

		System.out.print("Select an option: ");
		int menu = numberDecoder.nextInt();

			if (menu == 1) {
				System.out.println("1. Search");
				System.out.println("2. Service Nos");
				System.out.println("3. Add Name");
				System.out.println("4. Erase");
				System.out.println("5. Edit");
				System.out.println("6. Assign tone");
				System.out.println("7. Send b'card");
				System.out.println("8. Options");
				System.out.println("9. Speed dails");
				System.out.println("10. Voice tags");

			System.out.print("Select an option: ");
			int phonebookMenu = numberDecoder.nextInt();

				if (phonebookMenu == 1) {
					System.out.println("Search");
				}

				if (phonebookMenu == 2) {
					System.out.println("Service Nos");
				}			
				
				if (phonebookMenu == 3) {
					System.out.println("Add name");
				}

				if (phonebookMenu == 4) {
					System.out.println("Erase");
				}			
				
				if (phonebookMenu == 5) {
					System.out.println("Edit");
				}			
				
				if (phonebookMenu == 6) {
					System.out.println("Assign tone");
				}

				if (phonebookMenu == 7) {
					System.out.println("Send b'card");
				}
	
				if (phonebookMenu == 8) {
					System.out.println("1. Type of view");
					System.out.println("2. Memory status");

				System.out.print("Select an option: ");				
				int optionsMenu = numberDecoder.nextInt();

					if (optionsMenu == 1) {
						System.out.println("Type of view");
					}
					
					if (optionsMenu == 2) {
						System.out.println("Memory status");
					}
				}

				if (phonebookMenu == 9) {
					System.out.println("Speed dails");
				}

				if (phonebookMenu == 10) {
					System.out.println("Voice tags");
				}
			}

			if (menu == 2) {
				System.out.println("1. Write messages");
				System.out.println("2. Inbox");
				System.out.println("3. Outbox");
				System.out.println("4. Picture messages");
				System.out.println("5. Templates");
				System.out.println("6. Smileys");
				System.out.println("7. Messages settings");
				System.out.println("8. Info service");
				System.out.println("9. Voice mailbox number");
				System.out.println("10. Service command editor");
			
			System.out.print("Select an option: ");
			int messagesMenu = numberDecoder.nextInt();

				if (messagesMenu == 1) {
					System.out.println("Write message");
				}

				if (messagesMenu == 2) {
					System.out.println("Inbox");
				}			
				
				if (messagesMenu == 3) {
					System.out.println("Outbox");
				}

				if (messagesMenu == 4) {
					System.out.println("Picture messages");
				}			
				
				if (messagesMenu == 5) {
					System.out.println("Templates");
				}			
				
				if (messagesMenu == 6) {
					System.out.println("Smileys");
				}

				if (messagesMenu == 7) {
					System.out.println("1. Set 1");
					System.out.println("2. Common");

				System.out.print("Select an option: ");
				int messagesSettingsMenu = numberDecoder.nextInt();

					if (messagesSettingsMenu == 1) {
						System.out.println("1. Message centre number");
						System.out.println("2. Message sent as");
						System.out.println("3. Message validity");
				
					System.out.print("Select an option: ");
					int set1Menu = numberDecoder.nextInt();

						if (set1Menu == 1) {
							System.out.println("Message centre number");
						}
					
						if (set1Menu == 2) {
							System.out.println("Message sent as");
						}
						
						if (set1Menu == 3) {
							System.out.println("Message validity");
						}	
					} 

					if (messagesSettingsMenu == 2) {
						System.out.println("1. Delivery reports");
						System.out.println("2. Reply via same centre");
						System.out.println("3. Character support");

					System.out.print("Select an option: ");
					int commonMenu = numberDecoder.nextInt();
			
						if (commonMenu == 1) {
							System.out.println("Delivery reports");
						}

						if (commonMenu == 2) {
							System.out.println("Reply via same centre");
						}

						if (commonMenu == 3) {
							System.out.println("Character support");
						}
					} 
				
				}

				if (messagesMenu == 8) {
					System.out.println("Info service");
				}			
				
				if (messagesMenu == 9) {
					System.out.println("Voice mailbox number");
				}			
				
				if (messagesMenu == 10) {
					System.out.println("Service command editor");
				}

			}

			if (menu == 3) {
				System.out.println("Chat");
			}
		
			if (menu == 4) {
				System.out.println("1. Missed calls");
				System.out.println("2. Received calls");
				System.out.println("3. Dialled numbers");
				System.out.println("4. Erase recent call list");
				System.out.println("5. Show call duration");
				System.out.println("6. Show call costs");
				System.out.println("7. Call cost settings");
				System.out.println("8. Prepaid credit");
					
			System.out.print("Select an option: ");		
			int callRegisterMenu = numberDecoder.nextInt();

				if (callRegisterMenu == 1) {
					System.out.println("Missed calls");
				}

				if (callRegisterMenu == 2) {
					System.out.println("Received calls");
				}
				
				if (callRegisterMenu == 3) {
					System.out.println("Dialled numbers");
				}

				if (callRegisterMenu == 4) {
					System.out.println("Erase recent call lists");
				}

				if (callRegisterMenu == 5) {
					System.out.println("1. Last call duration");
					System.out.println("2. All calls' duration");
					System.out.println("3. Received calls' duration");
					System.out.println("4. Dialled calls' duration");
					System.out.println("5. Clear timers");

				System.out.print("Select an option: ");			
				int showCallDurationMenu = numberDecoder.nextInt();

					if (showCallDurationMenu == 1) {
						System.out.println("Last call duration");
					}
						
					if (showCallDurationMenu == 2) {
						System.out.println("All calls' duration");
					}
					
					if (showCallDurationMenu == 3) {
						System.out.println("Received calls' duration");
					}
			
					if (showCallDurationMenu == 4) {
						System.out.println("Dialled calls' duration");
					}
					
					if (showCallDurationMenu == 5) {
						System.out.println("Clear timers");
					}	
				}

				if (callRegisterMenu == 6) {
					System.out.println("1. Last call costs");
					System.out.println("2. All calls' cost");
					System.out.println("3. Clear counters");
		
				System.out.print("Select an option: ");
				int showCallCostsMenu = numberDecoder.nextInt();
				
					if (showCallCostsMenu == 1) {
						System.out.println("Last call costs");
					}

					if (showCallCostsMenu == 2) {
						System.out.println("All calls' cost");
					}
					
					if (showCallCostsMenu == 3) {
						System.out.println("Clear counters");
					}
				}

				if (callRegisterMenu == 7) {
					System.out.println("1. Call cost limit");
					System.out.println("2. Show cost in");

				System.out.print("Select an option: ");
				int callCostSettingsMenu = numberDecoder.nextInt();

					if (callCostSettingsMenu == 1) {
						System.out.println("Call cost limit");
					}

					if (callCostSettingsMenu == 2) {
						System.out.println("Show cost in");
					}
				}

				if (callRegisterMenu == 8) {
					System.out.println("Prepaid credit");
				}
								
			}
			
			if (menu == 5) {
				System.out.println("1. Ringing tone");
				System.out.println("2. Ringing volume");
				System.out.println("3. Incoming call alert");
				System.out.println("4. Composer");
				System.out.println("5. Message alert tone");
				System.out.println("6. Keypad tones");
				System.out.println("7. Warning and game tones");
				System.out.println("8. Vibrating alert");
				System.out.println("9. Screen saver");
			
			System.out.print("Select an option: ");
			int tonesMenu = numberDecoder.nextInt();

				if (tonesMenu == 1 ) {
					System.out.println("Ringing tone");
				}
	
				if (tonesMenu == 2) {
					System.out.println("Ringing volume");
				}
		
				if (tonesMenu == 3) {
					System.out.println("Incoming call alert");
				}
				
				if (tonesMenu == 4) {
					System.out.println("Composer");
				}
		
				if (tonesMenu == 5) {
					System.out.println("Message alert tone");
				}

				if (tonesMenu == 6) {
					System.out.println("Keypad tones");
				}

				if (tonesMenu == 7) {
					System.out.println("Warning and game tones");
				}

				if (tonesMenu == 8) {
					System.out.println("Vibrating alert");
				}

				if (tonesMenu == 9) {
					System.out.println("Screen saver");
				}
			}

			if (menu == 6) {
				System.out.println("1. Call settings");
				System.out.println("2. Phone settings");
				System.out.println("3. Security settings");
				System.out.println("4. Restore factory settings");

			System.out.print("Select an option: ");				
			int settingsMenu = numberDecoder.nextInt();
			
				if (settingsMenu == 1) {
					System.out.println("1. Automatic redial");
					System.out.println("2. Speed dialling");
					System.out.println("3. Call waiting options");
					System.out.println("4. Own number sending");
					System.out.println("5. Phone line in use");
					System.out.println("6. Automatic answer");

				System.out.print("Select an option: ");				
				int callSettingsMenu = numberDecoder.nextInt();
		
					if (callSettingsMenu == 1) {
						System.out.println("Automatic redial");
					}

					if (callSettingsMenu == 2) {
						System.out.println("Speed dialing");
					}

					if (callSettingsMenu == 3) {
						System.out.println("Call waiting options");
					}

					if (callSettingsMenu == 4) {
						System.out.println("Own number sending");
					}

					if(callSettingsMenu == 5) {
						System.out.println("Phone line in use");
					}

					if (callSettingsMenu == 6) {
						System.out.println("Automatic answer");
					}
				}
			
				if (settingsMenu == 2) {
					System.out.println("1. Language");
					System.out.println("2. Cell info display");
					System.out.println("3. Welcome note");
					System.out.println("4. Network selection");
					System.out.println("5. lights");
					System.out.println("6. Confirm SIM service actions");

				System.out.print("Select an option: ");				
				int phoneSettingsMenu = numberDecoder.nextInt();
		
					if (phoneSettingsMenu == 1) {
						System.out.println("Language");
					}

					if (phoneSettingsMenu == 2) {
						System.out.println("Cell info Display");
					}

					if (phoneSettingsMenu == 3) {
						System.out.println("Welcome note");
					}

					if (phoneSettingsMenu == 4) {
						System.out.println("Network selection");
					}

					if (phoneSettingsMenu == 5) {
						System.out.println("Lights");
					}

					if (phoneSettingsMenu == 6) {
						System.out.println("Confirm SIM service actions");
					}
				}

				if (settingsMenu == 3) {
					System.out.println("1. PIN code request");
					System.out.println("2. Call barring service");
					System.out.println("3. Fixed dialling");
					System.out.println("4. Closed user group");
					System.out.println("5. Phone security");
					System.out.println("6. Change access codes");

				System.out.print("Select an option: ");				
				int securitySettingsMenu = numberDecoder.nextInt();
		
					if (securitySettingsMenu == 1) {
						System.out.println("PIN code request");
					}

					if (securitySettingsMenu == 2) {
						System.out.println("Call barring service");
					}

					if (securitySettingsMenu == 3) {
						System.out.println("Fixed dialling");
					}

					if (securitySettingsMenu == 4) {
						System.out.println("Closed user group");
					}

					if(securitySettingsMenu == 5) {
						System.out.println("Phone security");
					}

					if (securitySettingsMenu == 6) {
						System.out.println("Change access codes");
					}
				}
			
				if (settingsMenu == 4) {
					System.out.println("Restore factory settings");
				}
			}

			if (menu == 7) {
				System.out.println("Call divert");
			}

			if (menu == 8) {
				System.out.println("Games");
			}

			if (menu == 9) {
				System.out.println("Calculator");
			}

			if (menu == 10) {
				System.out.println("Reminders");
			}

			if (menu == 11) {
				System.out.println("1. Alarm clock");
				System.out.println("2. Clock settings");
				System.out.println("3. Date setting");
				System.out.println("4. Stopwatch");
				System.out.println("5. Countdown timer");
				System.out.println("6. Auto update of date and time");
			
			System.out.print("Select an option: ");
			int clockMenu = numberDecoder.nextInt();

				if (clockMenu == 1) {
					System.out.println("Alarm clock");
				}

				if (clockMenu == 2) {
					System.out.println("Clock settings");	
				}
		
				if (clockMenu == 3) {
					System.out.println("Date settings");
				}
		
				if (clockMenu == 4) {
					System.out.println("Stopwatch");
				}

				if(clockMenu == 5) {
					System.out.println("Countdown timer");
				}
		
				if(clockMenu == 6) {
					System.out.println("Auto update of date and time");
				}

			}
			
			if (menu == 12) {
				System.out.println("Profiles");
			}
		
			if (menu == 13) {
				System.out.println("SIM services");
			}
			
	}

}