rooms = {
    'Courtyard': {'South': 'Great Hall'},  # First Room
    'Great Hall': {'North': 'Courtyard', 'South': 'Grand Staircase', 'East': 'Kitchen', 'item': 'suit of armor'},
    'Kitchen': {'West': 'Great Hall', 'item': 'healing potion'},
    'Grand Staircase': {'North': 'Great Hall', 'West': 'Armory', 'South': 'The Lounge', 'item': 'shield'},
    'Armory': {'East': 'Grand Staircase', 'item': 'hero sword'},
    'The Lounge': {'North': 'Grand Staircase', 'East': 'The Dungeon', 'item': 'torch'},
    'The Dungeon': {'West': 'The Lounge', 'North': 'Lair of the Necromancer', 'item': 'magic scroll'},
    'Lair of the Necromancer': {'South': 'The Dungeon'}  # Last Room
}


# defining the game instructions
def introduction():
    print('')
    print('********** Dark Fortress Text Adventure Game **********\n')
    print('*****************************************************')
    print('\nThere are 8 rooms to move between and 6 items to pick up\n')
    print('before you get to the end to slay the evil necromancer.\n')
    print('Directions: You can go North, South, East, or West\n')
    print('to navigate between rooms. If the room has an item\n')
    print('you can answer Y for yes or N for no to pick it up.\n')
    print('You can also type Exit to leave the game. Good Luck!\n')
    print('*****************************************************\n\n')


# Defining player status, prints
def player_status():
    print('=========================================')
    print('\nYou are currently in the {}'.format(currentRoom))
    print('\nYour current inventory: {}'.format(inventory))
    # print('You see a {}'.format(currentItem))
    print('\n=========================================')
    print('\n')


# Inventory list to hold inventory as it's added in each room
inventory = []

user_item = ''


# defining Inventory carried to add to inventory list
def game(item):
    # user_item = input('')

    if item in inventory:  # in operator checks if item already in inventory then prints inventory
        print("you already have got this")
        print(" ".join(inventory))

    elif item not in inventory:  # prompts to pick up any new item
        print('You see a', item)
        print('Would you like to pick it up? Y/N \n')
        user_item = input('')
        if user_item == 'Y':
            print('item has been added\n')
            inventory.append(item)
        else:
            print('You leave the item behind.')


# Beginning the game, setting variables and calling intro function.
currentRoom = 'Courtyard'

player_move = ''

introduction()

# While Loop for moving between rooms
while True:
    player_status()

    player_move = input('Enter a move: \n')

    if player_move == 'Exit':
        print('Goodbye, thanks for playing!')
        # break statement for exiting
        break

    if player_move in rooms[currentRoom]:
        currentRoom = rooms[currentRoom][player_move]

        addItem = input(' \n')

        if 'item' in rooms[currentRoom]:
            game(rooms[currentRoom]['item'])

        # if/else statements with break statement for final room/finishing the game
        if currentRoom == 'Lair of the Necromancer':
            if len(inventory) == 6:
                print('\n***********************     Congratulations!     ***********************')
                print('\n************************************************************************')
                print('\nYou have made it to the Lair of the Necromancer with all of the items to ')
                print('defeat the evil lich! You used the items you collected to defend')
                print('yourself, slay the foe, and clear the Dark Fortress of evil forever!\n')
                print('*************************************************************************\n')
                print('^^^^^^^^^^^^^^^^^^^^^^^^^^ Thanks for playing! ^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n')
                break

            else:
                print('\n################## You Failed! #####################')
                print('\n####################################################')
                print('\nYou are missing items needed to defeat the necromancer')
                print('and you have been vanquished! History will')
                print('remember nothing but the evil of the dark fortress forever.')
                print('\n####################################################\n')
                print('@@@@@@@@@@@@@@@@@@@ Please play again @@@@@@@@@@@@@@@@')
                break

    # else statement for input validation/invalid move
    else:
        print('\nNothing that way, try again.\n')
