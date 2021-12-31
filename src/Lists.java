import java.util.ArrayList;
import java.util.HashMap;

// I have these values hardcoded internally instead of reading from text files mainly because I have never been able to figure out how to bundle assets within the jar file itself.
// These are in their own file because, well...look at them. There's a lot of text and crap.
public class Lists {
    static String[] femaleNames = {"Aaliyah","Aarushi","Abagail","Abbey","Abbi","Abbie","Abby","Abi","Abia","Abigail","Abree","Abrianna","Abrielle","Aby","Acacia","Ada","Adalia","Adaline","Adalyn","Addie","Addilyn","Addison","Adelaide","Adele","Adelene","Adelia","Adelina","Adeline","Adelynn","Adreanna","Adriana","Adrianna","Adrianne","Adrienne","Aerona","Agatha","Aggie","Agnes","Aida","Aileen","Ailsa","Aimee","Aine","Ainsleigh","Ainsley","Aisha","Aisling","Aislinn","Aislynn","Alaina","Alana",
            "Alanis","Alanna","Alannah","Alaska","Alayah","Alayna","Alba","Albany","Alberta","Aleah","Alecia","Aleisha","Alejandra","Alena","Alessandra","Alessia","Alex","Alexa","Alexandra","Alexandria","Alexia","Alexis","Alexus","Ali","Alia","Alice","Alicia","Alina","Alisa","Alisha","Alison","Alissa","Alivia","Aliyah","Aliza","Alize","Alka","Allie","Allison","Ally","Allyson","Alma","Alondra","Alya","Alycia","Alyshialynn","Alyson","Alyssa","Alyssia","Amalia",
            "Amanda","Amandine","Amani","Amara","Amari","Amaris","Amaryllis","Amaya","Amber","Amberly","Amelia","Amelie","America","Amethyst","Amie","Amina","Amirah","Amity","Amy","Amya","Ana","Anabel","Anabelle","Anahi","Anais","Anamaria","Ananya","Anastasia","Andie","Andrea","Andromeda","Angel","Angela","Angelia","Angelica","Angelina","Angeline","Angelique","Angie","Anika","Anisa","Anissa","Anita","Aniya","Aniyah","Anjali","Ann","Anna","Annabel","Annabella",
            "Annabelle","Annabeth","Annalisa","Annalise","Annamaria","Anne","Anneke","Annemarie","Annette","Annie","Annika","Annmarie","Anthea","Antoinette","Antonia","Anuja","Anusha","Anushka","Anya","Aoibhe","Aoibheann","Aoife","Aphrodite","Apple","April","Aqua","Arabella","Arabelle","Arden","Aria","Ariadne","Ariana","Arianna","Arianne","Ariel","Ariella","Arielle","Arisha","Arleen","Arlene","Arlette","Artemis","Arwen","Arya","Asha","Ashanti","Ashlee","Ashleigh","Ashley","Ashlie",
            "Ashlyn","Ashlynn","Ashton","Ashvini","Asia","Asma","Aspen","Astrid","Athalia","Athena","Athene","Atlanta","Aubreanna","Aubree","Aubrey","Audra","Audrey","Audriana","Audrina","Augustina","Aurelia","Aurora","Autumn","Ava","Avaline","Avalon","Avery","Avia","Avril","Aya","Ayana","Ayanna","Ayesha","Ayisha","Ayla","Azalea","Azaria","Azariah","Bailey","Barbara","Barbie","Bay","Baylee","Bea","Beatrice","Beatrix","Becca","Beccy","Becky","Belinda",
            "Bella","Bellatrix","Belle","Benita","Bernadette","Bernice","Bertha","Beryl","Bess","Bessie","Beth","Bethan","Bethanie","Bethany","Betsy","Bettina","Betty","Bev","Beverly","Beyonce","Bianca","Billie","Blair","Blaire","Blake","Blakely","Blanche","Blaze","Blessing","Bliss","Bloom","Blossom","Blythe","Bobbi","Bobbie","Bobby","Bonita","Bonnie","Bonquesha","Braelyn","Brandi","Brandy","Braylee","Brea","Breanna","Bree","Breeze","Brenda","Brenna","Bria",
            "Briana","Brianna","Brianne","Briar","Bridget","Bridgette","Bridie","Brie","Briella","Brielle","Brigid","Briley","Brinley","Briony","Brisa","Bristol","Britney","Britt","Brittany","Brittney","Brodie","Brogan","Bronagh","Bronte","Bronwen","Bronwyn","Brook","Brooke","Brooklyn","Brooklynn","Bryanna","Brylee","Bryn","Brynlee","Brynn","Bryony","Bunty","Cadence","Cailin","Caitlan","Caitlin","Caitlyn","Caleigh","Cali","Calista","Callie","Calliope","Callista","Calypso","Cambria",
            "Cameron","Cami","Camila","Camilla","Camille","Campbell","Camry","Camryn","Candace","Candice","Candis","Candy","Caoimhe","Caprice","Cara","Carenza","Carina","Caris","Carissa","Carla","Carlene","Carley","Carlie","Carly","Carlynn","Carmel","Carmela","Carmen","Carol","Carole","Carolina","Caroline","Carolyn","Carrie","Carter","Carys","Casey","Cassandra","Cassia","Cassidy","Cassie","Cassiopeia","Cat","Catalina","Catarina","Cate","Caterina","Cathalina","Catherine","Cathleen",
            "Cathryn","Cathy","Catlin","Catrina","Catriona","Cayla","Ceanna","Cece","Cecelia","Cecilia","Cecily","Celeste","Celestia","Celestine","Celia","Celina","Celine","Celise","Ceri","Cerise","Cerys","Chanel","Chanelle","Chantal","Chantelle","Charis","Charissa","Charity","Charla","Charlene","Charlette","Charley","Charlie","Charlize","Charlotte","Charmaine","Chastity","Chelsea","Chelsey","Chenai","Chenille","Cher","Cheri","Cherie","Cherry","Cheryl","Cheyanne","Cheyenne","Chiara","Chloe",
            "Chole","Chris","Chrissy","Christa","Christabel","Christal","Christen","Christi","Christiana","Christiane","Christie","Christina","Christine","Christy","Chrysanthemum","Chrystal","Ciara","Cici","Ciel","Cierra","Cindy","Clair","Claire","Clara","Clarabelle","Clare","Clarice","Claris","Clarissa","Clarisse","Clarity","Clary","Claudette","Claudia","Claudine","Clea","Clemence","Clementine","Cleo","Cleopatra","Clodagh","Cloe","Clotilde","Clover","Coco","Colette","Colleen","Connie","Constance","Cora",
            "Coral","Coralie","Coraline","Cordelia","Cori","Corina","Corinne","Cornelia","Corra","Cosette","Courtney","Cressida","Cristal","Cristina","Crystal","Cyndi","Cynthia","Dagmar","Dahlia","Daina","Daisy","Dakota","Damaris","Dana","Danette","Dani","Danica","Daniela","Daniella","Danielle","Danika","Daphne","Dara","Darby","Darcey","Darcie","Darcy","Daria","Darla","Darlene","Dasia","Davida","Davina","Dawn","Dayle","Dayna","Daysha","Deana","Deandra","Deann",
            "Deanna","Deanne","Deb","Debbie","Debby","Debora","Deborah","Debra","Dede","Dee","Deedee","Deena","Deidre","Deirdre","Deja","Delaney","Delanie","Delany","Delia","Delilah","Delina","Della","Delores","Delphine","Demetria","Demi","Dena","Denice","Denise","Denny","Desiree","Destinee","Destiny","Diamond","Diana","Diane","Dianna","Dianne","Dido","Dilys","Dina","Dinah","Dionne","Dior","Dixie","Dolly","Dolores","Dominique","Donna","Dora",
            "Doreen","Doris","Dorla","Dorothy","Dot","Dottie","Drew","Dulce","Dusty","Dympna","Eabha","Ebony","Echo","Eden","Edie","Edith","Edna","Edwina","Effie","Eileen","Eilidh","Eimear","Eireann","Eisley","Elaina","Elaine","Elana","Eleanor","Electra","Elektra","Elen","Elena","Eliana","Elicia","Elida","Elin","Elina","Elinor","Elisa","Elisabeth","Elise","Eliza","Elizabeth","Ella","Elle","Ellen","Ellery","Ellie","Ellis","Elly",
            "Elodie","Eloise","Elora","Elouise","Elsa","Elsie","Elspeth","Elva","Elvina","Elvira","Elysia","Elyza","Emanuela","Ember","Emelda","Emely","Emer","Emerald","Emerson","Emi","Emilee","Emilia","Emilie","Emily","Emma","Emmalee","Emmaline","Emmalyn","Emmanuelle","Emmeline","Emmie","Emmy","Enid","Enya","Erica","Erika","Erin","Eris","Ernestine","Eryn","Esmay","Esme","Esmeralda","Esparanza","Esperanza","Estee","Estelle","Ester","Esther","Estrella",
            "Ethel","Eudora","Eugenie","Eunice","Eva","Evaline","Evangelina","Evangeline","Eve","Evelin","Evelina","Evelyn","Everly","Evie","Evita","Fabrizia","Faith","Fallon","Fanny","Farah","Farrah","Fatima","Fawn","Fay","Faye","Felicia","Felicity","Fern","Fernanda","Ffion","Fia","Fifi","Fion","Fiona","Fleur","Flick","Flo","Flora","Florence","Fran","Frances","Francesca","Francine","Francoise","Frankie","Freda","Freya","Frida","Gabby","Gabriela",
            "Gabriella","Gabrielle","Gail","Garnet","Gayle","Gaynor","Geena","Gemma","Gena","Genesis","Genevieve","Genna","Georgette","Georgia","Georgie","Georgina","Geraldine","Germaine","Gert","Gertrude","Gia","Gianna","Gigi","Gilda","Gillian","Gina","Ginger","Ginnie","Ginny","Giovanna","Gisela","Giselle","Gisselle","Gladys","Glenda","Glenys","Gloria","Glynis","Golda","Goldie","Grace","Gracelyn","Gracie","Grainne","Greta","Gretchen","Griselda","Guadalupe","Guinevere","Gwen",
            "Gwendolyn","Gwyneth","Habiba","Hadley","Hailee","Hailey","Haleigh","Haley","Halle","Hallie","Hanna","Hannah","Harley","Harmony","Harper","Harriet","Hattie","Haven","Hayden","Haylee","Hayley","Hazel","Hazeline","Heather","Heaven","Heidi","Helen","Helena","Helene","Helga","Helina","Henrietta","Hepsiba","Hera","Hermine","Hermione","Hester","Hetty","Hilary","Hilda","Hildegard","Hillary","Hollie","Holly","Honesty","Honey","Honor","Honour","Hope","Hortense",
            "Hyacinth","Ianthe","Ida","Ila","Ilene","Iliana","Ilona","Ilse","Imani","Imelda","Immy","Imogen","India","Indie","Indigo","Indira","Ines","Ingrid","Iona","Ira","Irena","Irene","Irina","Iris","Irma","Isa","Isabel","Isabell","Isabella","Isabelle","Isadora","Isha","Isidora","Isis","Isla","Isobel","Isolde","Itzel","Ivana","Ivy","Iyanna","Izabella","Izidora","Izzie","Izzy","Jacinda","Jacinta","Jackie","Jacqueline","Jacquelyn",
            "Jada","Jade","Jaden","Jadyn","Jaelynn","Jaida","Jaime","Jamie","Jamiya","Jan","Jana","Janae","Jancis","Jane","Janelle","Janessa","Janet","Janette","Jania","Janice","Janie","Janine","Janis","Janiya","January","Jaqueline","Jasmin","Jasmine","Jaya","Jayda","Jayden","Jayla","Jaylene","Jaylinn","Jaylynn","Jayne","Jazlyn","Jazmin","Jazmine","Jazz","Jean","Jeanette","Jeanine","Jeanna","Jeanne","Jeannette","Jeannie","Jeannine","Jemima","Jemma",
            "Jen","Jena","Jenelle","Jenessa","Jenna","Jennette","Jenni","Jennie","Jennifer","Jenny","Jensen","Jeri","Jerri","Jess","Jessa","Jessica","Jessie","Jet","Jewel","Jill","Jillian","Jo","Joan","Joann","Joanna","Joanne","Jocelyn","Jodi","Jodie","Jody","Joelle","Johanna","Jojo","Joleen","Jolene","Jolie","Joni","Jordan","Jordana","Jordyn","Jorja","Joselyn","Josephine","Josie","Journey","Joy","Joya","Joyce","Juanita","Jude",
            "Judith","Judy","Jules","Julia","Juliana","Julianna","Julianne","Julie","Julienne","Juliet","Juliette","Julissa","July","June","Juniper","Juno","Justice","Justina","Justine","Kacey","Kadence","Kaelyn","Kaidence","Kailey","Kailyn","Kaitlin","Kaitlyn","Kaitlynn","Kalea","Kaleigh","Kali","Kalia","Kalista","Kaliyah","Kallie","Kamala","Kamryn","Kara","Karen","Kari","Karin","Karina","Karissa","Karla","Karlee","Karly","Karolina","Karyn","Kasey","Kassandra",
            "Kassidy","Kassie","Kat","Katara","Katarina","Kate","Katelyn","Katelynn","Katerina","Katharine","Katherine","Kathleen","Kathryn","Kathy","Katia","Katie","Katlyn","Katniss","Katrin","Katrina","Katy","Katya","Kay","Kaya","Kaye","Kayla","Kaylee","Kayleigh","Kayley","Kaylie","Kaylin","Keana","Keara","Keeley","Keely","Keira","Keisha","Kelis","Kelley","Kelli","Kellie","Kelly","Kelsey","Kelsie","Kendall","Kendra","Kenna","Kennedy","Kenzie","Kera",
            "Keri","Kerian","Kerri","Kerry","Kia","Kiana","Kiara","Kiera","Kierra","Kiersten","Kiki","Kiley","Kim","Kimberlee","Kimberley","Kimberly","Kimbriella","Kimmy","Kinley","Kinsey","Kinsley","Kira","Kirsten","Kirstin","Kirsty","Kit","Kitty","Kizzy","Kloe","Kora","Kori","Kourtney","Kris","Krista","Kristen","Kristi","Kristie","Kristin","Kristina","Kristine","Kristy","Krystal","Kya","Kyla","Kylee","Kyleigh","Kylie","Kyra","Lacey","Lacie",
            "Lacy","Ladonna","Laila","Lainey","Lakyn","Lala","Lana","Laney","Lara","Larissa","Lark","Latoya","Laura","Laurel","Lauren","Laurie","Lauryn","Lavana","Lavender","Lavinia","Layla","Lea","Leah","Leandra","Leann","Leanna","Leanne","Leda","Lee","Leela","Leena","Leia","Leigh","Leila","Leilani","Lela","Lena","Lenora","Lenore","Leona","Leonie","Leonora","Leora","Lesley","Leslie","Lesly","Leticia","Letitia","Lettie","Lexi",
            "Lexia","Lexie","Lexis","Leyla","Lia","Liah","Liana","Lianne","Libbie","Libby","Liberty","Lidia","Liesl","Lila","Lilac","Lilah","Lili","Lilian","Liliana","Lilita","Lilith","Lillia","Lillian","Lillie","Lilly","Lily","Lina","Linda","Lindsay","Lindsey","Lindy","Lisa","Lisette","Liv","Livia","Livvy","Liz","Liza","Lizbeth","Lizette","Lizzie","Lizzy","Logan","Lois","Lola","Lolita","London","Lora","Loran","Lorelei",
            "Loren","Lorena","Loretta","Lori","Lorie","Lorna","Lorraine","Lorri","Lorrie","Lottie","Lotus","Lou","Louella","Louisa","Louise","Luann","Lucia","Luciana","Lucie","Lucille","Lucinda","Lucky","Lucy","Luisa","Lulu","Luna","Lupita","Luz","Lydia","Lyla","Lynda","Lyndsey","Lynette","Lynn","Lynne","Lynnette","Lynsey","Lyra","Lyric","Mabel","Macey","Macie","Mackenzie","Macy","Madalyn","Maddie","Maddison","Maddy","Madeleine","Madeline",
            "Madelyn","Madison","Madisyn","Madonna","Madyson","Mae","Maeve","Magda","Magdalena","Magdalene","Maggie","Maia","Maire","Mairead","Maisie","Maisy","Maja","Makayla","Makenna","Makenzie","Malia","Malina","Malinda","Mallory","Malory","Mandy","Manuela","Mara","Marcela","Marcella","Marcelle","Marci","Marcia","Marcie","Marcy","Margaret","Margarita","Margaux","Marge","Margie","Margo","Margot","Margret","Maria","Mariah","Mariam","Marian","Mariana","Marianna","Marianne",
            "Maribel","Marie","Mariela","Mariella","Marilyn","Marina","Marion","Maris","Marisa","Marisol","Marissa","Maritza","Marjorie","Marla","Marlee","Marlena","Marlene","Marley","Marnie","Marsha","Martha","Martina","Mary","Maryam","Maryann","Marybeth","Maryjane","Masie","Mathilde","Matilda","Mattie","Maude","Maura","Maureen","Mavis","Maxime","Maxine","May","Maya","Maybell","Mazie","Mckayla","Mckenna","Mckenzie","Mea","Meadow","Meagan","Meera","Meg","Megan",
            "Meghan","Mei","Mel","Melanie","Melina","Melinda","Melissa","Melody","Mercedes","Mercy","Meredith","Merida","Merissa","Meryl","Mia","Michaela","Michele","Michelle","Mika","Mikaela","Mikayla","Mikhaela","Mila","Mildred","Milena","Miley","Millicent","Millie","Milly","Mimi","Mina","Mindy","Minerva","Minnie","Mira","Mirabel","Mirabelle","Miracle","Miranda","Miriam","Mirielle","Missie","Misty","Mitzi","Modesty","Moira","Mollie","Molly","Mona","Monica",
            "Monika","Monique","Montana","Montserrat","Morgan","Morgana","Moya","Muriel","Mya","Myfanwy","Myla","Myra","Myrna","Myrtle","Nadene","Nadia","Nadine","Naja","Nala","Nana","Nancy","Nanette","Naomi","Natalia","Natalie","Natasha","Naya","Nayeli","Nell","Nellie","Nelly","Nena","Nerissa","Nessa","Nevaeh","Neve","Nia","Niamh","Nichola","Nichole","Nicki","Nicky","Nicola","Nicole","Nicolette","Nieve","Niki","Nikita","Nikki","Nila",
            "Nina","Nisha","Nishka","Nita","Noella","Noelle","Noely","Noemi","Nola","Nora","Norah","Noreen","Norma","Nova","Nyla","Oasis","Ocean","Octavia","Odalis","Odalys","Odele","Odelia","Odette","Olga","Olive","Olivia","Oona","Oonagh","Opal","Ophelia","Oprah","Oriana","Orianna","Orla","Orlaith","Page","Paige","Paisley","Paloma","Pam","Pamela","Pandora","Pansy","Paola","Paris","Patience","Patrice","Patricia","Patsy","Patti",
            "Patty","Paula","Paulette","Paulina","Pauline","Payton","Peace","Pearl","Peggy","Penelope","Penny","Perla","Perrie","Persephone","Petra","Petunia","Peyton","Phillipa","Philomena","Phoebe","Phoenix","Phyllis","Piper","Pippa","Pixie","Polly","Pollyanna","Poppy","Portia","Precious","Presley","Preslie","Primrose","Princess","Priscilla","Priya","Promise","Prudence","Prue","Queenie","Quiana","Quinn","Rabia","Rachael","Rachel","Rachelle","Rae","Raegan","Raelyn","Raina",
            "Raine","Ramona","Ramsha","Randi","Rani","Rania","Raquel","Raven","Raya","Rayna","Rayne","Reagan","Reanna","Reanne","Rebecca","Rebekah","Reese","Regan","Regina","Reilly","Reina","Remi","Rena","Renae","Renata","Rene","Renee","Renesmee","Reyna","Rhea","Rhian","Rhianna","Rhiannon","Rhoda","Rhona","Rhonda","Ria","Rianna","Richelle","Ricki","Rihanna","Rikki","Riley","Rina","Rita","River","Riya","Roanne","Roberta","Robin",
            "Robyn","Rochelle","Rocio","Roisin","Rolanda","Ronda","Roni","Ronna","Rosa","Rosalie","Rosalina","Rosalind","Rosalinda","Rosalynn","Rosanna","Rose","Roseanne","Rosella","Roselle","Rosemarie","Rosemary","Rosetta","Rosie","Rosy","Rowan","Rowena","Roxana","Roxanne","Roxie","Roxy","Rozlynn","Ruby","Rue","Ruth","Ruthie","Ryanne","Rydel","Rylee","Ryleigh","Rylie","Sabina","Sabine","Sable","Sabrina","Sade","Sadhbh","Sadie","Saffron","Safire","Safiya",
            "Sage","Sahara","Saige","Saira","Sally","Salma","Salome","Sam","Samantha","Samara","Samia","Samira","Sammie","Sammy","Sandra","Sandy","Sania","Saoirse","Sapphire","Sara","Sarah","Sarina","Sariya","Sascha","Sasha","Saskia","Savanna","Savannah","Scarlet","Scarlett","Sebastianne","Selah","Selena","Selene","Selina","Selma","Senuri","September","Seren","Serena","Serenity","Shakira","Shamira","Shana","Shania","Shannon","Shari","Sharon","Shary","Shauna",
            "Shawn","Shawna","Shawnette","Shayla","Shayna","Shea","Sheba","Sheena","Sheila","Shelby","Shelia","Shelley","Shelly","Sheri","Sheridan","Sherri","Sherrie","Sherry","Sheryl","Shirley","Shivani","Shona","Shonagh","Shreya","Shyann","Shyla","Sian","Sidney","Sienna","Sierra","Sigourney","Silvia","Simone","Simran","Sindy","Sinead","Siobhan","Sky","Skye","Skylar","Skyler","Sloane","Snow","Sofia","Sofie","Sondra","Sonia","Sonja","Sonya","Sophia",
            "Sophie","Sophy","Sorrel","Spring","Stacey","Staci","Stacie","Stacy","Star","Starla","Stefanie","Stella","Steph","Stephanie","Sue","Sugar","Suki","Summer","Susan","Susanna","Susannah","Susanne","Susie","Sutton","Suzanna","Suzanne","Suzette","Suzie","Suzy","Sybil","Sydney","Sylvia","Sylvie","Tabatha","Tabitha","Tagan","Tahlia","Tailynn","Tala","Talia","Talitha","Taliyah","Tallulah","Tamara","Tamera","Tami","Tamia","Tamika","Tammi","Tammie",
            "Tammy","Tamra","Tamsin","Tania","Tanika","Tanisha","Tanya","Tara","Taryn","Tasha","Tasmin","Tatiana","Tatum","Tawana","Taya","Tayah","Tayla","Taylah","Tayler","Taylor","Teagan","Teegan","Tegan","Teigan","Tenille","Teresa","Teri","Terri","Terrie","Terry","Tess","Tessa","Thalia","Thea","Thelma","Theodora","Theresa","Therese","Thomasina","Tia","Tiana","Tiara","Tiegan","Tiffany","Tilly","Tina","Tisha","Toni","Tonia","Tonya",
            "Tora","Tori","Tracey","Traci","Tracie","Tracy","Tricia","Trina","Trinity","Trish","Trisha","Trista","Trixie","Trixy","Trudy","Tula","Tulip","Tyra","Ulrica","Uma","Una","Ursula","Valentina","Valeria","Valerie","Valery","Vanessa","Veda","Velma","Venetia","Venus","Vera","Verity","Veronica","Vicki","Vickie","Vicky","Victoria","Vienna","Viola","Violet","Violetta","Virginia","Virginie","Vivian","Viviana","Vivien","Vivienne","Wallis","Wanda",
            "Waverley","Wendi","Wendy","Whitney","Wilhelmina","Willa","Willow","Wilma","Winifred","Winnie","Winnifred","Winona","Winter","Wynne","Xandra","Xandria","Xanthe","Xaviera","Xena","Xia","Ximena","Xochil","Xochitl","Yasmin","Yasmina","Yasmine","Yazmin","Yelena","Yesenia","Yessica","Yolanda","Ysabel","Yula","Yulissa","Yvaine","Yvette","Yvonne","Zada","Zaheera","Zahra","Zaira","Zakia","Zali","Zara","Zaria","Zaya","Zayla","Zelda","Zelida","Zelina",
            "Zena","Zendaya","Zia","Zina","Zita","Ziva","Zoe","Zoey","Zola","Zora","Zoya","Zula","Zuri","Zyana"};

    static String[] maleNames = {"Aaron","Abdul","Abdullah","Abe","Abel","Abraham","Abram","Abriel","Ace","Adam","Adan","Addison","Ade","Aden","Adnan","Adonis","Adrian","Adriel","Ahmad","Ahmed","Aidan","Aiden","Ainsley","Ajay","Al","Alain","Alan","Alaric","Alastair","Albany","Albert","Alberto","Albie","Alden","Aldo","Aldric","Aldrin","Alec","Aled","Alejandro","Alen","Alesandro","Alex","Alexander","Alexis","Alfie","Alfonse","Alfonso","Alfred","Alfredo","Ali",
            "Alistair","Allan","Allen","Alonzo","Aloysius","Alphonso","Alton","Alvin","Amari","Amir","Amit","Amos","Anand","Anderson","Andre","Andreas","Andres","Andrew","Andy","Angel","Angelo","Angus","Ansel","Anson","Anthony","Anton","Antonio","Antony","Apollo","Aran","Archer","Archie","Ari","Arjun","Arlo","Arman","Armando","Arnold","Aron","Arran","Arrie","Art","Arthur","Arturo","Arun","Arwin","Asa","Asad","Ash","Ashby",
            "Asher","Ashley","Ashton","Ashwin","Aspen","Aston","Aswin","Athan","Atticus","Aubrey","Auden","Audwin","August","Augustus","Austen","Austin","Aven","Avery","Axel","Ayaan","Ayden","Bailey","Barack","Barclay","Barnaby","Barney","Barrett","Barron","Barry","Bart","Bartholomew","Basil","Bastian","Baxter","Bay","Baylor","Bear","Beau","Beck","Beckett","Bellamy","Ben","Benedict","Benjamin","Benji","Benjy","Bennett","Bennie","Benny","Benson",
            "Bentley","Bently","Bernard","Bernardo","Bernie","Bert","Bertie","Bertram","Bev","Bevan","Bill","Billy","Bjorn","Bladen","Blain","Blaine","Blair","Blaise","Blake","Blaze","Blue","Bob","Bobby","Bodie","Bogdan","Boris","Boston","Bowen","Boyd","Brad","Braden","Bradford","Bradley","Bradwin","Brady","Braeden","Bram","Branden","Brandon","Brantley","Braxton","Bray","Brayan","Brayden","Braydon","Braylon","Breck","Brendan","Brenden","Brendon",
            "Brennan","Brennon","Brent","Brentley","Brenton","Bret","Brett","Brevin","Brevyn","Brian","Brice","Bridie","Brie","Brighton","Brinley","Brock","Brod","Brodie","Brody","Brogan","Bronson","Brooke","Brooks","Bruce","Bruno","Bryan","Bryant","Bryce","Bryden","Brydon","Bryn","Bryon","Bryson","Buck","Buddy","Burt","Burton","Buster","Butch","Byron","Cadby","Cade","Caden","Cael","Caelan","Caesar","Cai","Caiden","Cain","Caius",
            "Cal","Cale","Caleb","Calhoun","Callan","Callen","Callum","Calum","Calvin","Cam","Camden","Cameron","Campbell","Camron","Carey","Carl","Carlisle","Carlos","Carlton","Carsen","Carson","Carsten","Carter","Cary","Casey","Cash","Cason","Casper","Cassius","Castiel","Castor","Cathal","Cato","Cavan","Cayden","Caydon","Cayson","Cecil","Cedric","Cesar","Chad","Chance","Chandler","Channing","Charles","Charley","Charlie","Charlton","Chas","Chase",
            "Chaz","Che","Chesney","Chester","Chevy","Chip","Chris","Christian","Christopher","Chuck","Cian","Ciaran","Cillian","Clancy","Clarence","Clark","Claude","Clay","Clayton","Clement","Cletus","Cliff","Clifford","Clifton","Clint","Clinton","Clive","Clyde","Coby","Cody","Cohen","Colby","Cole","Colin","Collin","Colm","Colt","Colton","Conan","Conner","Connor","Conor","Conrad","Constantine","Cooper","Corbin","Corey","Cormac","Cornelius","Cory",
            "Craig","Cristian","Cristobal","Crosby","Cruz","Cullen","Curt","Curtis","Cuthbert","Cyril","Cyrus","Dacey","Daire","Dakota","Dale","Dalen","Dallas","Dalton","Damian","Damien","Damion","Damon","Dan","Dana","Dane","Daniel","Danny","Dante","Dara","Daragh","Darcy","Daren","Darian","Darin","Dario","Darius","Darnell","Darragh","Darrel","Darrell","Darren","Darrin","Darryl","Darryn","Darwin","Daryl","Dash","Dashawn","Dave","David",
            "Davin","Davion","Davis","Dawson","Dax","Daxon","Daxter","Daxton","Dayton","Deacon","Dean","Deandre","Declan","Deepak","Delbert","Demetrius","Denis","Dennis","Denny","Denver","Denzel","Deon","Derek","Dermot","Derrick","Deshaun","Deshawn","Desmond","Dev","Devin","Devlin","Devon","Devyn","Dewayne","Dewey","Dexter","Diarmuid","Dick","Dicky","Diego","Digby","Dilan","Dillon","Dimitri","Dinesh","Dino","Dion","Dirk","Django","Dmitri",
            "Dominic","Dominick","Don","Donald","Donnie","Donovan","Dorian","Doug","Douglas","Doyle","Drake","Drew","Duane","Dudley","Duke","Duncan","Dustin","Dwayne","Dwight","Dylan","Eamon","Earl","Earnest","Eason","Easton","Ed","Eddie","Eddy","Eden","Edgar","Edison","Edmund","Edouard","Edric","Edsel","Eduardo","Edward","Edwardo","Edwin","Efrain","Efren","Egan","Egon","Eli","Elias","Elijah","Eliot","Elisha","Ellington","Elliot",
            "Elliott","Ellis","Elmer","Elmo","Elon","Elton","Elvis","Elwyn","Emanuel","Emerson","Emery","Emet","Emil","Emiliano","Emilio","Emlyn","Emmanuel","Emmerson","Emmet","Emmett","Ennio","Enoch","Enrique","Enzo","Eoghan","Eoin","Eric","Erick","Erik","Ernest","Ernesto","Ernie","Errol","Ervin","Erwin","Esteban","Ethan","Ethen","Etienne","Euan","Euen","Eugene","Eustace","Evan","Evangelos","Evelyn","Everett","Ewan","Ezekiel","Ezio",
            "Ezra","Fabian","Fabio","Faisal","Farley","Febian","Felipe","Felix","Fenton","Fergal","Fergus","Fernand","Fernando","Fidel","Finbar","Finlay","Finley","Finn","Finnian","Finnigan","Fionn","Fletcher","Florian","Floyd","Flynn","Ford","Forest","Forrest","Foster","Fox","Francesco","Francis","Francisco","Frank","Frankie","Franklin","Franklyn","Fraser","Fred","Freddie","Freddy","Frederick","Fredrick","Fritz","Gabe","Gabriel","Gael","Gaelan","Gage","Gale",
            "Galen","Gannon","Gareth","Garman","Garrett","Garrison","Garry","Garth","Gary","Gaston","Gavin","Gene","Geoff","Geoffrey","George","Geraint","Gerald","Gerard","Gerardo","Germain","Gerry","Gian","Gibson","Gideon","Gil","Gilbert","Gilberto","Giles","Gino","Giorgio","Giovanni","Glen","Glenn","Glyndwr","Glynn","Godfrey","Godric","Godwin","Gonzalo","Gordon","Grady","Graeme","Graham","Granger","Grant","Grayson","Greg","Gregg","Gregor","Gregory",
            "Grey","Greyson","Griffin","Guillermo","Gunnar","Gunner","Gus","Gustav","Gustavo","Guy","Haden","Haiden","Hal","Hamish","Han","Hank","Hans","Harlan","Harley","Harold","Harris","Harrison","Harry","Harvey","Hassan","Hayden","Hayes","Heath","Hector","Hendrik","Hendrix","Henley","Henri","Henry","Herbert","Herman","Heston","Hilary","Holden","Homer","Horace","Horatio","Howard","Hubert","Hudson","Hugh","Hugo","Humberto","Humphrey","Hunter",
            "Huw","Hywel","Iain","Ian","Ianto","Ibrahim","Idris","Ieuan","Iggy","Ignacio","Igor","Ike","Imran","Indiana","Inigo","Ira","Irvin","Irving","Irwin","Isaac","Isaiah","Isaias","Ishaan","Ishmael","Isiah","Isidore","Ismael","Israel","Issac","Ivan","Ivor","Jace","Jack","Jackie","Jackson","Jacob","Jacoby","Jacques","Jaden","Jadon","Jagger","Jago","Jai","Jaiden","Jaime","Jak","Jake","Jakob","Jalen","Jamal",
            "James","Jameson","Jamie","Jamison","Jan","Jared","Jaret","Jariel","Jarod","Jarrett","Jarrod","Jarvis","Jase","Jason","Jasper","Javid","Javier","Javon","Jax","Jaxon","Jaxson","Jay","Jayce","Jayden","Jaydon","Jaylen","Jaylin","Jaylon","Jayson","Jeb","Jebediah","Jed","Jedediah","Jediah","Jedidiah","Jeff","Jefferson","Jeffery","Jeffrey","Jeffry","Jensen","Jenson","Jerald","Jeremiah","Jeremy","Jericho","Jermaine","Jerome","Jerry","Jersey",
            "Jesse","Jessie","Jesus","Jet","Jethro","Jett","Jevan","Jim","Jimmie","Jimmy","Joachim","Joaquin","Jock","Jody","Joe","Joel","Joey","Johan","John","Johnathan","Johnathon","Johnnie","Johnny","Jon","Jonah","Jonas","Jonathan","Jonathon","Jonty","Jordan","Jordon","Jordy","Jorge","Jose","Joseph","Josh","Joshua","Josiah","Joss","Josue","Jovan","Juan","Judah","Judas","Judd","Jude","Julian","Julio","Julius","Justice",
            "Justin","Kade","Kaden","Kai","Kaiden","Kaine","Kale","Kaleb","Kameron","Kane","Karl","Karson","Karsten","Kash","Kasper","Kayden","Kayle","Kaylen","Kayson","Kean","Keanu","Keaton","Kedrick","Keegan","Keenan","Keith","Kellan","Kellen","Kellin","Kelly","Kelvin","Ken","Kendall","Kendrick","Kennedy","Kenneth","Kenny","Kent","Kenton","Kerry","Kevin","Khalid","Khalil","Kian","Kiefer","Kieran","Kieron","Killian","Kim","Kingsley",
            "Kingston","Kip","Kiran","Kirby","Kirk","Kit","Klaus","Klay","Knox","Kobe","Koby","Kody","Kolby","Kris","Krish","Kristian","Kristoff","Kristopher","Kurt","Kurtis","Kyan","Kye","Kylar","Kyle","Kylen","Kyler","Kyran","Kyrin","Kyron","Lacey","Lachlan","Lake","Lamar","Lamont","Lance","Landen","Landon","Landyn","Lane","Langdon","Langston","Larry","Lars","Laurence","Laurie","Lawrence","Lawson","Layne","Layton","Leaf",
            "Leandro","Lebron","Ledger","Lee","Leigh","Leighton","Leland","Len","Lennie","Lennon","Lennox","Lenny","Leo","Leon","Leonard","Leonardo","Leonel","Leopold","Leroy","Les","Leslie","Lester","Leuan","Lev","Leven","Levi","Levy","Lewis","Lex","Leyton","Liam","Lief","Lincoln","Linden","Link","Linus","Lionel","Lisandro","Llewelyn","Lloyd","Lochlan","Logan","Loki","London","Lonnie","Lorcan","Loren","Lorenzo","Loris","Lou",
            "Louie","Louis","Lowell","Luca","Lucas","Lucian","Luciano","Luigi","Luis","Lukas","Luke","Luther","Lyle","Lyndon","Lynn","Lysander","Mack","Maddox","Magnus","Maison","Malachi","Malakai","Malcolm","Malik","Malloy","Manny","Manuel","Marc","Marcel","Marco","Marcos","Marcus","Marik","Mario","Marion","Mark","Marley","Marlon","Marquis","Marshall","Martin","Marty","Martyn","Marvin","Mason","Massimo","Mat","Mateo","Mathew","Matt",
            "Matthew","Matthias","Maurice","Mauricio","Maverick","Max","Maxim","Maximilian","Maximus","Maxwell","Mehdi","Mehtab","Mekhi","Mel","Melvin","Merick","Mervin","Mervyn","Micah","Michael","Micheal","Mick","Mickey","Miguel","Mike","Mikey","Milan","Miles","Miller","Milo","Milton","Misha","Mitch","Mitchell","Mitt","Moe","Mohamed","Mohammad","Mohammed","Moises","Monte","Montgomery","Monty","Mordecai","Morgan","Morris","Moses","Muhammad","Murphy","Murray",
            "Myles","Mylo","Myron","Nash","Nasir","Nate","Nath","Nathan","Nathanael","Nathaniel","Neal","Ned","Nehemiah","Neil","Nelson","Nesbit","Nestor","Neville","Nevin","Niall","Nicholas","Nick","Nickolas","Nicky","Nico","Nicolas","Nigel","Nihal","Nik","Niklaus","Niko","Nikolai","Nikolas","Nile","Nils","Noah","Noe","Noel","Nolan","Norbert","Norman","Nyle","Oakes","Oakley","Oberon","Octavio","Oisin","Olaf","Oli","Oliver",
            "Ollie","Olly","Omar","Oran","Orion","Orlando","Orson","Oscar","Osvaldo","Oswald","Otis","Otto","Owain","Owen","Ozzie","Ozzy","Pablo","Paco","Paddy","Padraig","Palmer","Paolo","Parker","Pascal","Pat","Patrick","Paul","Paxton","Payton","Pearce","Pedro","Percy","Perry","Petar","Pete","Peter","Peyton","Phebian","Phil","Philip","Philippe","Phillip","Phineas","Phoenix","Pierce","Piers","Pip","Porter","Poul","Prakash",
            "Preston","Prince","Princeton","Quentin","Quincy","Quinlan","Quinn","Quinton","Quintrell","Rafael","Rafferty","Raheem","Rahul","Raiden","Raj","Rajesh","Ralph","Ram","Rameel","Ramon","Ramsey","Randal","Randall","Randolph","Randy","Raoul","Raphael","Rashad","Rashan","Rashid","Raul","Ravi","Ray","Raylan","Raymond","Reece","Reed","Reef","Reese","Reggie","Reginald","Rehan","Reid","Reilly","Remco","Remington","Remy","Ren","Rene","Reuben",
            "Rex","Reynaldo","Reza","Rhett","Rhydian","Rhys","Rian","Ricardo","Rich","Richard","Richie","Rick","Rickey","Rickie","Ricky","Rico","Rider","Rik","Riker","Riley","Rio","Riordan","River","Roan","Rob","Robbie","Robby","Robert","Roberto","Robin","Rocco","Rock","Rocky","Rod","Roddy","Roderick","Rodger","Rodney","Rodolfo","Rodrigo","Rogelio","Roger","Rohan","Roland","Rolando","Roman","Romeo","Ron","Ronald","Ronan",
            "Ronnie","Ronny","Roosevelt","Rory","Roscoe","Ross","Rowan","Roy","Royce","Ruairi","Ruben","Rubin","Rudolph","Rudy","Rufus","Rupert","Russ","Russell","Rusty","Ryan","Ryder","Ryker","Rylan","Ryland","Ryle","Ryley","Sacha","Said","Salman","Salvador","Salvatore","Sam","Samir","Sammy","Samson","Samuel","Sandeep","Sandy","Sanjay","Santiago","Sasha","Saul","Sawyer","Scot","Scott","Scottie","Scotty","Seamus","Sean","Seb",
            "Sebastian","Sebastien","Sebestian","Sergio","Seth","Shadrach","Shane","Shannon","Shaun","Shawn","Shay","Shayne","Shea","Sheldon","Shelton","Sherlock","Sherman","Sherwin","Shiloh","Sid","Sidney","Silas","Simeon","Simon","Sky","Skylar","Skyler","Slade","Sol","Solomon","Sonny","Soren","Spencer","Spike","Stacey","Stacy","Stan","Stanley","Stefan","Stephan","Stephen","Sterling","Steve","Steven","Stevie","Stewart","Stone","Storm","Struan","Stuart",
            "Sufyan","Sullivan","Sven","Sylvester","Tadhg","Talon","Tam","Tanner","Tariq","Tarquin","Tate","Taylor","Teague","Ted","Teddy","Teo","Terence","Terrance","Terrell","Terrence","Terry","Tevin","Tex","Thad","Thaddeus","Theo","Theodore","Theon","Theophilus","Thomas","Thor","Tiago","Tiberius","Tiernan","Tiger","Tim","Timmy","Timothy","Tito","Titus","Tobias","Tobin","Toby","Tod","Todd","Tom","Tomas","Tommie","Tommy","Tony",
            "Torin","Toryn","Trace","Tracey","Tracy","Travis","Tray","Tremaine","Trent","Trenton","Trevon","Trevor","Trey","Tristan","Tristen","Triston","Troy","Truman","Tucker","Turner","Ty","Tylan","Tyler","Tyrese","Tyrone","Tyson","Ulrich","Ulysses","Umar","Uriah","Uriel","Usama","Valentin","Valentine","Valentino","Van","Vance","Vasco","Vaughn","Vernon","Victor","Vidal","Vihan","Vijay","Vikram","Vince","Vincent","Vinnie","Virgil","Vishal",
            "Vivian","Vlad","Vladimir","Wade","Walker","Wallace","Wally","Walter","Warren","Waylon","Wayne","Wendell","Wes","Wesley","Westin","Weston","Wilbert","Wilbur","Wiley","Wilfred","Wilhelm","Will","Willam","Willard","Willem","William","Willie","Willis","Wilson","Winston","Wolf","Wolfgang","Woody","Wyatt","Xander","Xavier","Xerxes","Yahir","Yardley","Yehudi","Yestin","York","Yuri","Yusuf","Yves","Zac","Zach","Zachariah","Zachary","Zachery",
            "Zack","Zackary","Zackery","Zaiden","Zain","Zaine","Zak","Zander","Zane","Zayden","Zayn","Zayne","Zeb","Zebulon","Zed","Zeke","Zeph","Ziggy","Zion","Zoltan","Zuriel","Zylen"
    };

    static String[] surnames = {"Abell","Abram","Abramowitz","Acdemy","Ackworth","Acton","Adams","Addicock","Addington","Adidas","Adlam","Adley","Aeka","Aensland","Agard","Ainsley","Ainsworth","Alasdair","Alban","Alberona","Albers","Alby","Aldebourne","Alfray","Alicock","Alisia","Allard","Allen","Allerton","Allington","Alora","Alston","Altham","Alton","Amberden","Amcotts","Amiko","Amondsham","Anaka","Ande","Anderton","Andes","Andies","Andrews","Annable","Annesley","Ansley","Ansty","Aoshima","Appleton","Archer",
            "Ardall","Ardens","Ardern","Argen","Argentein","Arnold","Arthur","Asger","Ashby","Ashcombe","Ashenhurst","Asheton","Ashley","Ashton","Askew","Asou","Asplin","Astley","Atherton","Atkinson","Atlee","Atterton","Attilburgh","Aubrey","Audeley","Audlington","Avari","Aviana","Axton","Ayde","Ayleward","Aylmer","Aynesworth","Babham","Babington","Badby","Bailey","Baker","Balam","Baldwin","Ballard","Ballett","Bammard","Barber","Barclay","Bardolf","Barefoot","Barker","Barlow","Barnes",
            "Barney","Barras","Barre","Barrentine","Barrett","Barstaple","Bartelot","Barthomeloi","Barton","Basset","Bassinger","Bathurst","Battersby","Battle","Baylock","Baynton","Beaubier","Beauchamp","Beaumont","Beaurepaire","Beckingham","Beckwith","Beckworth","Bedell","Bedgberry","Bedingfeld","Beer","Beesley","Beeton","Beilschimdt","Bell","Bellflower","Bend","Benigni","Bennet","Benson","Bentham","Benthey","Bentley","Berdwell","Berecraft","Beresford","Berit","Berkeley","Berkhead","Bernard","Bernewelt","Bernini","Berry","Berwick",
            "Best","Bettsthorne","Beverly","Bewforest","Bewley","Bexley","Bigley","Billing","Billingford","Bing","Bingham","Bird","Birkenhead","Bishop","Bishopson","Bishoptree","Bisley","Blackmon","Blacknall","Blackwell","Blackwood","Bladewell","Blakeley","Blankley","Blatt","Blennerhayset","Blexham","Blodwell","Blomgren","Bloom","Bloor","Blotter","Blount","Blundell","Blyth","Blythe","Bobblehead","Boddenham","Bohan","Bona","Bonnano","Boote","Boothe","Boran","Borrell","Borrow","Bosby","Bost","Bostock","Boston",
            "Bothy","Botteler","Boulder","Bourne","Boville","Bowcer","Bowett","Bownell","Bowyar","Bradbridge","Bradford","Bradley","Bradly","Bradshaw","Bradshawe","Bradstone","Brady","Bramfield","Brampton","Branch","Brandon","Branson","Branwhaite","Brassie","Braunstone","Braxton","Bray","Brayles","Brecknock","Bredham","Breeden","Brent","Brereton","Brett","Brewiss","Brewster","Bricusse","Bridgeman","Briggs","Brightstone","Brina","Brinkhurst","Bristol","Bristow","Brixton","Broadhurst","Brocksby","Brodeway","Brodnax","Brokehill",
            "Brokop","Brome","Brook","Brougham","Broughton","Browett","Brown","Brownflet","Browning","Brownrigg","Brudenell","Bryan","Buckham","Buckingham","Budd","Buendia","Bulger","Bulkeley","Bulstrode","Burgess","Burgh","Burghill","Burgoyne","Burington","Burlton","Burnell","Burney","Burton","Bushbury","Buslingthorpe","Butler","Buzzi","Byfield","Byron","Cacciatore","Caley","Callthorpe","Camden","Campden","Canaris","Canon","Cantilupe","Capers","Cappa","Carbonall","Cardiff","Carel","Carew","Carlisle","Carlton",
            "Carlyle","Carmilla","Carter","Cason","Cassiday","Cassy","Castell","Castletown","Catesby","Catrell","Cattell","Cavaliere","Cavell","Caxton","Ceallach","Cely","Centurio","Ceri","Cerridwen","Chamberlain","Champneys","Chanceller","Chandler","Chantilly","Chapman","Charles","Charlton","Chase","Chatham","Chatwyn","Chauncey","Cheddar","Chelsey","Chernock","Chester","Chetwood","Cheverell","Cheyne","Chichester","Child","Childern","Chilton","Cholmondeley","Chowne","Christel","Chudderley","Church","Churchill","Churmond","Ciccio",
            "Cinco","Ciro","Clapham","Clare","Clark","Clavell","Claybrook","Clayden","Clayton","Clement","Clerk","Clifford","Clifton","Clinton","Clitherow","Clive","Cloney","Clopton","Cobb","Cobham","Cobley","Cockayne","Cod","Coddington","Coffin","Coggshall","Cojocaru","Colbalt","Colbie","Colby","Cole","Colkins","Collard","Colmer","Colt","Colthurst","Colton","Complin","Compton","Conciergerie","Conlee","Conquest","Cooger","Cooke","Coola","Coombs","Cooperman","Coorthopp","Copeland","Coppinger",
            "Corbett","Corbo","Corby","Corea","Corinthian","Cornish","Corrington","Corsa","Corus","Cosplayer","Cossington","Cosworth","Cotton","Coughlan","Courtenay","Covert","Cowill","Cox","Cracknell","Crafts","Crane","Cranford","Cranton","Crawford","Crawley","Cressy","Crickett","Cripps","Crisp","Cristemas","Crocker","Crofton","Cromwell","Crooke","Croomy","Crugg","Cuddon","Culligan","Culpepper","Cumberbatch","Cumhaill","Cunningham","Curtis","Curzon","Cutshaw","Dabura","Dagworth","Dale","Dalingridge","Dalton",
            "Damsell","Dancerella","Danett","Danvers","Darado","Daragon","Darby","Darcy","Darl","Darley","Darlington","Daubernon","Daunce","Dauncey","Daundelyon","Daven","Davenport","Davy","Dawne","Day","Dayton","Deacons","Dean","Deau","Deering","Degen","Deighton","Delabere","Delamere","Delling","Delly","Delmas","Delphina","Delune","Dencourt","Denholm","Dennis","Denton","Denvir","Dericott","Derington","Desford","Devins","Digby","Dimmick","Dimmock","Dinley","Dipper","Dixton","Doddle",
            "Dogmersfield","Domon","Donavin","Donnett","Doreward","Dormer","Dove","Dow","Downer","Dragul","Drako","Drakul","Draper","Draw","Drayton","Dreamwalker","Dreher","Drumm","Drune","Dryden","Dryland","Dudley","Dunch","Duncombe","Dunham","Dunsmore","Duredent","Durk","Durov","Dusteby","Dye","Dynham","Eamon","Eastaughffe","Eastoft","Easton","Eban","Eckersley","Edgar","Edgcombe","Edgerton","Edmundson","Edson","Edwards","Eggerley","Eglisfeld","Eirika","Elles","Elliot","Ellis",
            "Elmebrigge","Elton","Emerson","Emsworth","Endor","Enfield","Engham","England","Engleford","Englisch","Epworth","Erewaker","Ermin","Ertham","Esmund","Estbury","Eston","Etchingham","Etton","Evangelos","Everard","Everdon","Everleigh","Everly","Everworth","Evingar","Eyer","Eyston","Fabian","Fabien","Fairman","Faldo","Fane","Farindon","Fawcett","Faygo","Fayneman","Feely","Felbrigg","Feld","Feliciana","Fellers","Felson","Fende","Fenton","Ferre","Ferrer","Fessenden","Fetch","Feversham",
            "Fichtner","Fidele","Fienley","Filbert","Filkins","Finch","Finchel","Findern","Fineux","Fiorella","Fisher","Fiss","Fite","Fitton","Fitzgeoffrey","Fitzherbert","Fitzlewis","Fitzralph","Fitzwarren","Fitzwilliam","Flam","Flasher","Fleet","Fleetwood","Fleming","Flewelling","Flexney","Florentino","Flower","Fodd","Fogg","Foliot","Foljambe","Follon","Follywolle","Folsham","Fonteyn","Ford","Forder","Fortescue","Fortey","Fountian","Fowler","Fox","Foxie","Francey","Francisca","Franklin","Frappacino","Fraunces",
            "Freen","Freer","Freville","Frewell","Frilende","Frilleck","Frith","Froggenhall","Fromond","Froste","Frowseloure","Frye","Fukunaga","Fulburne","Fulmer","Fulton","Furi","Furnace","Gage","Gaiden","Gainsford","Galasso","Galey","Galia","Gann","Gardiner","Gare","Garen","Garfield","Garnis","Garrard","Garret","Garrety","Garrick","Garvin","Gascoigne","Gasper","Gath","Gavell","Gedding","Genta","Geoffrey","George","Geppetto","Gerard","Geron","Gerville","Geste","Getter","Ghana",
            "Gibbs","Gifford","Gilbert","Gilcrest","Gill","Ginter","Gisborne","Gittens","Gladstone","Glennon","Glover","Gobberd","Goddam","Godfrey","Godoy","Gold","Golding","Goldwell","Gomershall","Gomfrey","Gonson","Good","Goodenouth","Gooder","Goodeve","Goodluck","Goodnestone","Goodrick","Goodrington","Goodwin","Googoo","Gores","Goring","Gorney","Gorst","Gosebourne","Goudling","Graber","Graeme","Grafton","Graham","Graiman","Gratton","Gray","Grayden","Greene","Greenlake","Greenway","Grego","Grenefeld",
            "Gresham","Greville","Grey","Grimbald","Grobbam","Grofhurst","Groston","Grove","Guicciardi","Guildford","Gurin","Habib","Hackman","Hackney","Haddock","Haddon","Hadlee","Hadleigh","Hadley","Hadresham","Hailey","Hakebourne","Hale","Halevy","Haley","Halibel","Hall","Hallewell","Halley","Halliwel","Halsey","Haly","Hambard","Hames","Hamilton","Hammer","Hammond","Hampden","Hampton","Hancock","Handleman","Hannaford","Hansart","Hansley","Hanssen","Hapgood","Harbird","Harbottle","Harcourt","Hardacre",
            "Hardy","Harewell","Hargreve","Harisson","Harkman","Harlakinden","Harlan","Harleston","Harley","Harlow","Harpeden","Harper","Harrington","Harris","Harte","Hartford","Hartzler","Harvard","Harvy","Harwood","Hasard","Hastings","Hatch","Hatcliff","Hautreeve","Hawkins","Hawksworth","Hawtrey","Hayden","Haydock","Haye","Hayes","Hayhurst","Hayley","Hayton","Hazeldine","Heenan","Heimann","Hellscythe","Helm","Henshawe","Herleston","Heron","Herrold","Hertcomb","Hervey","Heydon","Heywood","Heyworth","Hickens",
            "Hiddle","Hideaki","Hielo","Higden","Highgate","Hikage","Hilderley","Hill","Himmelman","Hinson","Hisakawa","Hitchcock","Hiyama","Hoare","Hobart","Hochstetter","Hodd","Hodgson","Hofer","Hoke","Holbrook","Holcott","Holland","Holsey","Holt","Holton","Honoria","Hoodish","Hopson","Hopton","Horman","Hornebolt","Hornley","Hornsby","Horsey","Horthall","Horton","Hosteler","Hotham","Howard","Huckabee","Huddleston","Hueneme","Hugeford","Hughes","Hungate","Hurst","Husdon","Hussey","Hutchinson",
            "Huxley","Hyde","Iceheart","Imhoff","Imus","Ingleson","Inwood","Ishan","Ishizu","Isley","Italiana","Jackmann","Jackson","James","Jamey","Janner","Jarman","Jarry","Jay","Jaymes","Jendring","Jenney","Jenssen","Jillette","Johanne","Johar","Johnson","Jolee","Jordan","Josefina","Joslin","Joulon","Jowchet","Kailey","Kama","Kamali","Kamir","Kary","Katims","Katniss","Keckilpenny","Kedward","Kela","Kellett","Kellman","Kelly","Kelsey","Kemp","Kendal","Kendall",
            "Kendric","Kendry","Kenley","Kennison","Kensley","Kent","Keoghan","Keough","Keriell","Kerrington","Kesteven","Key","Khushrenada","Kidwelly","Killigrew","Killingworth","Kimberley","Kimberly","Kimo","Kimoto","Kinchloe","Kindell","Kiner","Kinge","Kinomiya","Kinsley","Kirby","Kirkeby","Kitaen","Kitani","Kitson","Kittie","Kiyone","Knighton","Knivetton","Knody","Knoyll","Knyvett","Kolb","Korine","Kosa","Kostner","Kottow","Krabappel","Krelborne","Krentz","Kristopher","Kruegger","Kruze","Kuklinski",
            "Kuroyuki","Kuzak","Kyleson","Kyon","Lacy","Lakin","Lally","Lambert","Lambton","Lancaster","Landon","Langdon","Langley","Langston","Lanzoni","Lappage","Latham","Latisha","Latton","Lauderdale","Launceleyn","Lave","Lavrov","Law","Lawhead","Lawnder","Leal","Leech","Leeds","Lehenard","Leigh","Leighlin","Leighton","Lele","Leman","Leming","Lennart","Lenneth","Lennix","Lenscherr","Lenton","Lesher","Lester","Lestrange","Letterford","Leventhorpe","Leverer","Leveson","Lewis","Leynham",
            "Leynthall","Limsey","Lincoln","Lind","Lindsay","Lindsey","Linea","Lingo","Linwe","Liripine","Lisk","Lisle","Litchfield","Litcott","Littlebury","Litton","Liverich","Livesey","Livingstone","Lloyd","Lockton","Loddington","Lond","London","Long","Longton","Loper","Lorin","Lovell","Loveney","Lowth","Loyola","Lucado","Lucy","Ludsthorp","Luke","Lukin","Lumbard","Lungren","Lupton","Lussier","Luxor","Lydie","Lyfeld","Lynes","Lyon","Lyubov","Ma's","MaIle","Macbeths",
            "Macedonia","Magdelena","Magrath","Maitre","Makepiece","Malemayns","Malins","Mallen","Maloni","Maloof","Malster","Maltoun","Mame","Manfield","Mang","Mannerheim","Mansen","Manston","Manutius","Mapilton","Marcheford","Marez","Markeley","Marlee","Marleigh","Marley","Marlowe","Marmont","Marris","Marsham","Marston","Marten","Mason","Massingberd","Maston","Maudit","Mauntell","Maycott","Maydestone","Mayne","Maynwaring","Mayuzumi","Mcdowell","Mead","Medeley","Meiers","Merden","Mereworth","Merideth","Merstun",
            "Merton","Metcalf","Michelgrove","Michell","Middleton","Mill","Millet","Millis","Milner","Milsent","Milton","Mima","Mirima","Mitchell","Miyasaki","Mogan","Moland","Molins","Molyngton","Monde","Montacute","Montagu","Moore","Morabito","More","Morecott","Morley","Morna","Moroni","Morris","Mortimer","Morton","Moryet","Motesfont","Motts","Mouskouri","Mowfurth","Mugen","Mugg","Mullens","Mura","Muramasa","Musaki","Muston","Myerscough","Myrna","Nagoya","Naka","Nanao","Narbridge",
            "Narr","Narracott","Nash","Nassir","Natori","Navaro","Neale","Neela","Neuwirth","Nevinson","Newdegate","Newman","Nexdor","Nibley","Nightwood","Nimes","Nimh","Nissa","Nobuko","Noke","Norbury","Norden","Norris","North","Northcott","Northwood","Norton","Norwich","Norwood","Notfeld","Nottingham","Noyce","Nyan","Nyland","Nysell","Oakensheild","Oakes","Oakley","Obson","Ogden","Oke","Oken","Olajuwon","Olingworth","Oliver","Onan","Oneill","Oprah","Ordon","Ordway",
            "Osborne","Osillbury","Osteler","Osterberg","Ouka","Outlawe","Ovens","Overall","Oxenbrigg","Ozaki","Packo","Padick","Page","Pagg","Palmer","Panshawe","Papley","Parfitt","Parker","Parkour","Parrett","Parris","Parsons","Paston","Patria","Patternson","Paxton","Payne","Payton","Peacock","Pearsons","Peck","Peckham","Peel","Pelletoot","Peltie","Pemberton","Penhallick","Pennebrygg","Perchehay","Perelli","Perle","Perris","Perrot","Perry","Perryvall","Petham","Petley","Petree","Pettit",
            "Pettwood","Pevinsie","Peyton","Phagan","Philips","Piace","Pickering","Piggott","Pimentel","Pimple","Pinkerton","Pinnock","Pinty","Playters","Plessey","Plimmswood","Plotz","Plover","Plowman","Poff","Pole","Polsted","Polton","Ponyboy","Porter","Portington","Potter","Powlett","Pownder","Pratt","Pray","Prelate","Prescott","Presley","Preston","Prophet","Prowd","Puppington","Purles","Purpleton","Pursglove","Quintel","Quintin","Quinton","Radley","Rampston","Ramsay","Ramsey","Rasmusen","Ratchett",
            "Ratcliff","Ratzenberger","Raudell","Rawlin","Rawson","Rayden","Raynolds","Raynsford","Read","Reanna","Reber","Recca","Redfield","Redman","Reed","Reena","Reeve","Reid","Reinhard","Reizei","Remington","Renteria","Resturaunt","Reynes","Ribera","Richeman","Richmond","Rickey","Rickhill","Rickworth","Ridley","Riley","Ringer","Rippringham","Risley","Rivan","Rivendare","Robbins","Roberts","Robertson","Robinson","Rochester","Rochforth","Rodchester","Rodney","Rokuro","Roland","Rolleston","Rolo","Romp",
            "Rondel","Ront","Roper","Roscoe","Rossy","Rous","Rovin","Rowdon","Rowe","Rowlett","Rowley","Royal","Royston","Rudhall","Rufford","Ruggenall","Ruggwain","Rusch","Russell","Rutherford","Rutland","Ryall","Rylan","Ryland","Ryley","Sacheverell","Sackville","Saden","Sadler","Sadow","Saintaubin","Saintjohn","Salacia","Salford","Salgado","Salman","Salter","Saltonstall","Salvato","Sampson","Samuell","Sanburne","Sanda","Sandrilene","Sandys","Sanyo","Saperstein","Sarisa","Sartor","Saunders",
            "Saunterton","Savill","Savoie","Sayer","Saynsberry","Scarcliff","Schillinger","Scobahull","Scolfield","Scott","Scroggs","Scrope","Sedley","Selestia","Selia","Seline","Selwyn","Serche","Serna","Sesshy","Sever","Seymour","Seys","Shabazz","Shadi","Shaefer","Shakaku","Sharman","Shawe","Sheffield","Shelby","Sheldon","Shelley","Shelly","Sheraton","Sherbourne","Sherman","Shern","Sherwood","Shevington","Shilton","Shinagami","Shingleton","Shipp","Shipwash","Shirakawa","Shirley","Shiveley","Shoesmith","Shorditch",
            "Shotbolt","Shurikens","Sibbell","Siddle","Siegfrids","Siempre","Sigfried","Silico","Silvano","Silvester","Simeon","Simmons","Sinclair","Siska","Skadi","Skern","Skipwith","Slain","Slanzar","Sleaford","Slyfield","Sman","Smith","Smythson","Snape","Snayth","Snell","Snelling","Snowdon","Soames","Sondra","Sorens","Sorta","Sotton","Soulstealer","Southey","Spalding","Spanner","Sparhawk","Sparkes","Sparrow","Spaulding","Spebbington","Speir","Spelman","Spencer","Spettell","Spicer","Spradlin","Springfield",
            "Sprottle","Sprunt","Squeeled","Stacy","Stafford","Stanbury","Standon","Stanford","Stanley","Stansfield","Stanton","Stanwix","Stape","Staple","Stapleton","Stauf","Stauffenberg","Staunton","Staverton","Stepney","Steven","Steward","Stille","Stirk","Stockton","Stoddeley","Stoke","Stokerton","Stokes","Stokey","Stone","Stoner","Stoop","Stoughton","Strachleigh","Strader","Stradford","Strangewayes","Stratford","Strayhorn","Street","Strelley","Strigoi","Stubb","Styles","Sudbury","Suishou","Suke","Sulyard","Sumner",
            "Suteki","Sutherland","Sutton","Suwako","Swan","Sweetecok","Sweetman","Swetenham","Switt","Syaoron","Sydney","Synn","Tabard","Taiyou","Takino","Talisa","Tamahome","Tame","Tannis","Tattersall","Tatum","Taylor","Tedcastle","Tekai","Tench","Tenley","Tetsusaiga","Thackeray","Thomas","Thornburgh","Thorne","Thornton","Thorpe","Threarah","Throckmorton","Thursby","Tibbord","Tiberi","Tice","Tilghman","Tindall","Tinley","Tiploft","Toot","Topsfield","Torrington","Torris","Totthill","Touko","Towels",
            "Town","Tramell","Tranton","Treadaway","Tregonwell","Trenowyth","Trevett","Trixibelle","Trollope","Trumpington","Trystan","Tubney","Tullio","Turner","Turnquist","Twarby","Tweedy","Tyndall","Tyrell","Ufford","Ultor","Underhill","Unton","Upton","Urawa","Uriah","Urswick","Valent","Valmer","Valtos","Vance","Vanderhoff","Vanellope","Varga","Vasari","Vaugh","Vaughan","Vawdrey","Veldon","Vena","Venables","Verney","Vernon","Vettori","Vickerson","Vinter","Wade","Wadham","Waechter","Wake",
            "Wakefield","Walcott","Waldegrave","Waldeley","Walden","Walford","Walker","Wallace","Walpole","Walrond","Walsch","Waltham","Walton","Wantell","Warbulton","Warde","Wardes","Wardyworth","Warner","Warren","Warwick","Washington","Waterton","Wayen","Wayte","Weal","Webb","Webley","Wedgwood","Weeks","Welbeck","Welby","Weld","Wellington","Wellins","Wemmick","Wenman","Wensley","Wentworth","Wesley","West","Westbrook","Westcott","Westlake","Weston","Wetherden","Wexcombe","Wharton","Wheatley","Whisker",
            "Whitacker","Whitby","White","Whitewood","Whitton","Whowood","Whyting","Widdowson","Wightman","Wilberforce","Wilkins","Wilko","Willardsey","Willcotts","Williams","Willis","Willmer","Willoughby","Wilmot","Wilson","Winchester","Windham","Windslow","Windsor","Wingates","Wingfield","Winkle","Winship","Winston","Winstringham","Winter","Winterbourne","Winthrop","Winthrope","Wiseman","Wisniewski","Wissy","Withinghall","Witton","Wolfden","Wolford","Wolstonton","Wolton","Wood","Woodbrygg","Woodward","Wordsworth","Worsley","Wotton","Wreke",
            "Wrenn","Wright","Wyard","Wyatt","Wyghtham","Wylde","Wymer","Wyville","Yahtzee","Yamano","Yardley","Yashiro","Yate","Yaxley","Yeardley","Yelverton","Yokohama","York","Yorke","Yorkes","Yornold","Youkilis","Young","Yuichi","Yula","Yuley","Yuudai","Zelretch","Zephiel","Zerg","Zharkov"
    };

    static String[] aaaaaaaaaaaaaa = { "Trans Man", "Trans Woman", "Male", "Female", "Genderfluid", "Genderflux",
            "Two-Spirit", "Non-Binary", "Agender", "Bigender", "PolyGender", "Pangender", "Intersex", "Demiboy",
            "Demigirl" };

    static String[] romantic = {"Aromantic","Biromantic","Heteroromantic","Homoromantic","Panromantic","Polyromantic",
            "Greyromantic","Demiromantic"};

    static String[] posTraits = {"Active","Adaptable","Admirable","Adventerous","Agreeable","Alert","Allocentric","Amiable",
            "Anticipative","Appreciative","Articulate","Aspiring","Attractive","Balanced","Benevolent",
            "Brilliant","Calm","Capable","Captivating","Caring","Charismatic","Charming","Cheerful","Clean",
            "Clear-Headed","Clever","Colourful","Companionly","Compassionate","Concilliary","Confident",
            "Conscientious","Considerate","Constant","Contemplative","Cooperative","Courageous","Courteous",
            "Creative","Cultured","Curious ","Daring","Decent","Decisive","Dedicated","Deep","Dignified",
            "Directed","Disciplined","Discreet","Earnest","Ebullient","Educated","Efficient","Elegant",
            "Eloquent","Empathetic","Energetic","Enthusiastic","Esthetic","Exciting","Extrodinary","Fair",
            "Faithful","Farsighted","Flexible","Focused","Forgiving","Forthright","Free-Thinking","Friendly",
            "Fun-Loving","Gallant","Generous","Gentle","Genuine","Good-Natured","Gracious","Hardworking",
            "Healthy","Hearty","Helpful","Heroic","High-Minded","Honest","Honourable","Humble","Humourous",
            "Idealistic","Imaginative","Impressive","Independent","Innovative","Insightful","Intelligent",
            "Intuitive","Kind","Loveable","Logical","Loyal","Mature","Methodical","Meticulous","Modest","Neat",
            "Observant","Open","Optimistic","Orderly","Passionate","Patient","Peaceful","Perceptive","Personable",
            "Playful","Practical","Precise","Principaled","Protective","Punctual","Rational","Realistic",
            "Resourceful","Responsible","Relaxed","Reliable","Secure","Selfless","Sensitive","Sentimental",
            "Serious","Sharing","Simple","Skillful","Sociable","Solid","Sophisticated","Stable","Steadfast",
            "Stoic","Strong","Studious ","Subtle ","Sweet","Sympathetic","Tasteful","Teacherly","Thorough","Tidy",
            "Tolerant","Trusting","Understanding","Venturesome","Vivasious", "Warm","Witty","Youthful"};

    static String[] negTraits = {"Abrupt","Agonizing","Aimless","Aloof","Anxious","Arrogant","Assertive","Barbaric","Bland","Blunt",
            "Boisterous","Brutal","Cantankerous","Careless","Cautious","Childish","Clumsy","Coarse","Cold",
            "Complaintive","Compulsive","Conceited","Confused","Cowardly","Crass","Crazy","Crude","Cynical",
            "Deceitful","Destructive","Devious","Dishonest","Disrespectful","Disruptive","Distractible",
            "Dogmatic","Domineering","Drunk","Dull","Egocentric","Envious","Erratic","Excitable","Faithless",
            "Fearful","Fickle","Fiery","Foolish","Forgetful","Gloomy","Graceless","Greedy","Gullible","Hesitant",
            "Hostile","Ignorant","Impatient","Impulsive","Inconsiderate","Indecisive","Insecure","Insensitive",
            "Insincere","Irrational","Irresponsible","Irritable","Lazy","Melancholic","Messy","Miserable",
            "Miserly","Misguided","Moody","Naive","Narcissistic","Narrow","Neurotic","Nihilistic","Obnoxious",
            "Paranoid","Presumptuous","Pretentious","Procrastinating","Resentful","Rowdy","Scornful",
            "Secretive","Sedentary","Selfish","Shallow","Shortsighted","Shy","Sloppy","Slow","Sly","Softheaded",
            "Tactless","Tense","Thievish","Thoughtless","Timid","Troublesome","Unconvincing","Uncooperative",
            "Unimaginative","Unreliable","Unstable","Vague","Vulnerable","Weak"};

    static HashMap<String, String> coloursMap = new HashMap<>();
    static ArrayList<String> colourNames = new ArrayList<>();
    static ArrayList<String> hairColours = new ArrayList<>();
    static ArrayList<String> sexualities = new ArrayList<>();
    static ArrayList<String> genders = new ArrayList<>();

    static Integer femNamesLength;
    static Integer maleNamesLength;
    static Integer surnamesLength;
    static Integer colourNamesLength;
    static Integer hairColoursLength;
    static Integer gendersLength;
    static Integer sexualitiesLength;
    static Integer posTraitsLength;
    static Integer negTraitsLength;

    public static void initValues(){
        femNamesLength = femaleNames.length;
        maleNamesLength = maleNames.length;
        surnamesLength = surnames.length;
        posTraitsLength = posTraits.length;
        negTraitsLength = negTraits.length;

        initColours();
        initHairColours();
        initSexualities();
        initGenders();
    }

    // Chganged to string array list from string array and added items because that makes it easier to add content in the future.
    public static void initHairColours(){
        hairColours.add("White");
        hairColours.add("Auburn");
        hairColours.add("Light Brown");
        hairColours.add("Medium Brown");
        hairColours.add("Dark Brown");
        hairColours.add("Light Blonde");
        hairColours.add("Medium Blonde");
        hairColours.add("Red");
        hairColours.add("Chestnut");
        hairColours.add("Golden Blonde");
        hairColours.add("Copper");
        hairColours.add("Black");
        hairColours.add("Strawberry Blonde");
        hairColoursLength = hairColours.size();
        hairColours.sort(String::compareToIgnoreCase);
    }

    // This will probably end up being the eye colours.
    public static void initColours(){
        // These are actually just CSS colours from: https://www.w3schools.com/cssref/css_colors.asp
        // This data structure, means I can add and remove stuff freely if colours turn out to suck, or I wish to add more colours.
        coloursMap.put("Alice Blue","#F0F8FF");
        coloursMap.put("Antique White","#FAEBD7");
        coloursMap.put("Aqua","#00FFFF");
        coloursMap.put("Aquamarine","#7FFFD4");
        coloursMap.put("Azure","#F0FFFF");
        coloursMap.put("Beige","#F5F5DC");
        coloursMap.put("Bisque","#FFE4C4");
        coloursMap.put("Black","#000000");
        coloursMap.put("Blanched Almond","#FFEBCD");
        coloursMap.put("Blue","#0000FF");
        coloursMap.put("Blue Violet","#8A2BE2");
        coloursMap.put("Brown","#A52A2A");
        coloursMap.put("Burley Wood","#DEB887");
        coloursMap.put("Cadet Blue","#5F9EA0");
        coloursMap.put("Chartruese","#7FFF00");
        coloursMap.put("Chocolate","#D2691E");
        coloursMap.put("Coral","#FF7f50");
        coloursMap.put("Cornflower Blue","#6495ED");
        coloursMap.put("Cornsilk","#FFF8DC");
        coloursMap.put("Crimson","#DC143C");
        coloursMap.put("Cyan","#00FFFF");
        coloursMap.put("Dark Blue","#00008B");
        coloursMap.put("Dark Cyan","#008B8B");
        coloursMap.put("Dark Goldenrod","#B8860B");
        coloursMap.put("Dark Grey","#A9A9A9");
        coloursMap.put("Dark Green","#006400");
        coloursMap.put("Dark Khaki","#BDB76B");
        coloursMap.put("Dark Magenta","#8B008B");
        coloursMap.put("Dark Olive Green","#556B2F");
        coloursMap.put("Dark Orange","#FF8C00");
        coloursMap.put("Dark Orchid","#9932CC");
        coloursMap.put("Dark Red","#8B0000");
        coloursMap.put("Dark Salmon","#E9967A");
        coloursMap.put("Dark Sea Green","#8FBC8F");
        coloursMap.put("Dark Slate Blue","#483D8B");
        coloursMap.put("Dark Slate Grey","#2F2F2F");
        coloursMap.put("Dark Turquoise","00CED1");
        coloursMap.put("Dark Violet","#9400D3");
        coloursMap.put("Deep Pink","#FF1493");
        coloursMap.put("Deep Sky Blue","#00BFFF");
        coloursMap.put("Dim Grey","#696969");
        coloursMap.put("Dodger Blue","#1E90FF");
        coloursMap.put("Fire Brick","#B22222");
        coloursMap.put("Floral White","#FFFAF0");
        coloursMap.put("Forest Green","#228B22");
        coloursMap.put("Fuchsia","#FF00FF");
        coloursMap.put("Gainsboro","#DCDCDC");
        coloursMap.put("Ghost White","#F8F8FF");
        coloursMap.put("Gold","#FFD700");
        coloursMap.put("Goldenrod","#DAA520");
        coloursMap.put("Grey","#808080");
        coloursMap.put("Green","#008000");
        coloursMap.put("Green Yellow","#ADFF2F");
        coloursMap.put("Honeydew","#F0FFF0");
        coloursMap.put("Hot Pink","#FF69B4");
        coloursMap.put("Indian Red","#CD5C5C");
        coloursMap.put("Indigo","#4B0082");
        coloursMap.put("Ivory","#FFFFF0");
        coloursMap.put("Khaki","#F0E68C");
        coloursMap.put("Lavender","#E6E6FA");
        coloursMap.put("Lavender Blush","#FFF0F5");
        coloursMap.put("Lawn Green","#7CFC00");
        coloursMap.put("Lemon Chiffon","#FFFACD");
        coloursMap.put("Light Blue","#ADD8E6");
        coloursMap.put("Light Coral","#F08080");
        coloursMap.put("Light Cyan","#E0FFFF");
        coloursMap.put("Light Goldenrod Yellow","#FAFAD2");
        coloursMap.put("Light Grey","#D3D3D3");
        coloursMap.put("Light Green","#90EE90");
        coloursMap.put("Light Pink","#FFB6C1");
        coloursMap.put("Light Salmon","#FFA07A");
        coloursMap.put("Light Sea Green","#20B2AA");
        coloursMap.put("Light Sky Blue","#87CEFA");
        coloursMap.put("Light Slate Grey","#778899");
        coloursMap.put("Light Steel Blue","#B0C4DE");
        coloursMap.put("Light Yellow","#FFFFE0");
        coloursMap.put("Lime","#00FF00");
        coloursMap.put("Lime Green","#32CD32");
        coloursMap.put("Linen","#FAF0E6");
        coloursMap.put("Magenta","#FF00FF");
        coloursMap.put("Maroon","#800000");
        coloursMap.put("Medium Aquamarine","#66CDAA");
        coloursMap.put("Medium Blue","#0000CD");
        coloursMap.put("Medium Orchid","#BA55D3");
        coloursMap.put("Medium Purple","#9370DB");
        coloursMap.put("Medium Sea Green","#3CB371");
        coloursMap.put("Medium Slate Blue","#7B68EE");
        coloursMap.put("Medium Spring Green","#00FA9A");
        coloursMap.put("Medium Turquoise","#48D1CC");
        coloursMap.put("Medium Violet Red","#C71585");
        coloursMap.put("Midnight Blue","#191970");
        coloursMap.put("Mint Cream","#F5FFFA");
        coloursMap.put("Misty Rose","#FFE4E1");
        coloursMap.put("Moccasin","#FFE4B5");
        coloursMap.put("Navajo White","#FFDEAD");
        coloursMap.put("Navy","#000080");
        coloursMap.put("Old Lace","#FDF5E6");
        coloursMap.put("Olive","#808000");
        coloursMap.put("Olive Drab","#6B8E23");
        coloursMap.put("Orange","#FFA500");
        coloursMap.put("Orange Red","#FF4500");
        coloursMap.put("Orchid","#DA70D6");
        coloursMap.put("Pale Goldenrod","#EEE8AA");
        coloursMap.put("Pale Green","#98FB98");
        coloursMap.put("Pale Turquoise","#AFEEEE");
        coloursMap.put("Pale Violet Red","#DB7093");
        coloursMap.put("Papaya Whip","#FFEFD5");
        coloursMap.put("Peach Puff","#FFDAB9");
        coloursMap.put("Peru","#CD853F");
        coloursMap.put("Pink","#FFC0CB");
        coloursMap.put("Plum","#DDA0DD");
        coloursMap.put("Powder Blue","#B0E0E6");
        coloursMap.put("Purple","#800080");
        coloursMap.put("Rebecca Purple","#663399");
        coloursMap.put("Red","#FF0000");
        coloursMap.put("Rosy Brown","#BC8F8F");
        coloursMap.put("Royal Blue","#4169E1");
        coloursMap.put("Saddle Brown","#8B4513");
        coloursMap.put("Salmon","#FA8072");
        coloursMap.put("Sandy Brown","#F4A460");
        coloursMap.put("Sea Green","#2E8B57");
        coloursMap.put("Sea Shell","#FFF5EE");
        coloursMap.put("Sienna","#A0522D");
        coloursMap.put("Silver","#C0C0C0");
        coloursMap.put("Sky Blue","#87CEEB");
        coloursMap.put("Slate Blue","#6A5ACD");
        coloursMap.put("Slate Grey","#708090");
        coloursMap.put("Snow","#FFFAFA");
        coloursMap.put("Spring Green","#00FF7F");
        coloursMap.put("Steel Blue","#4682B4");
        coloursMap.put("Tan","#D2B48C");
        coloursMap.put("Teal","#008080");
        coloursMap.put("Thistle","#D8BFD8");
        coloursMap.put("Tomato","#FF6347");
        coloursMap.put("Turquoise","#40E0D0");
        coloursMap.put("Violet","#EE82EE");
        coloursMap.put("Wheat","#F5DEB3");
        coloursMap.put("White","#FFFFFF");
        coloursMap.put("White Smoke","#F5F5F5");
        coloursMap.put("Yellow","#FFFF00");
        coloursMap.put("Yellow Green","#9ACD32");

        colourNames.addAll(coloursMap.keySet());
        colourNames.sort(String::compareToIgnoreCase);

        colourNamesLength = colourNames.size();
    }

    public static void initSexualities(){
        sexualities.add("Gay or Lesbian");
        sexualities.add("Straight");
        sexualities.add("Polysexual");
        sexualities.add("Pansexual");
        sexualities.add("Asexual");
        sexualities.add("Greysexual");
        sexualities.add("Demisexual");
        sexualitiesLength = sexualities.size();
        sexualities.sort(String::compareToIgnoreCase);
    }

    public static void initGenders(){
        genders.add("Trans Man");
        genders.add("Trans Woman");
        genders.add("Male");
        genders.add("Female");
        genders.add("Genderfluid");
        genders.add("Genderflux");
        genders.add("Demigirl");
        genders.add("Demiboy");
        genders.add("Intersex");
        genders.add("Agender");
        genders.add("Non-Binary");
        genders.add("Two-Spirit");
        genders.add("Bigender");
        genders.add("Pangender");
        genders.add("PolyGender");
        gendersLength = genders.size();
        genders.sort(String::compareToIgnoreCase);
    }
}
