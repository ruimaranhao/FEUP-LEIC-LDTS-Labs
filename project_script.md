# [Software Design and Testing Laboratory](https://sigarra.up.pt/feup/en/UCURR_GERAL.FICHA_UC_VIEW?pv_ocorrencia_id=484407)


## Project Description

For the LDTS course unit's project, you will develop a **text-based game**, in **Java**, taking into consideration the following:

- The game ought to be [**text-based**](https://en.wikipedia.org/wiki/Text-based_game) and use [lanterna](https://github.com/mabe02/lanterna) as its GUI framework

  - :thinking: discuss in class with your professor the game you plan to implement.

- You ought to follow _good_ object oriented **design practices** (as discussed in class, at the very least).

- The main focus of the project is not its complexity but good usage of **design patterns**.

- Together with the project, you will write a **report** (writting in GitHub's markdown) addressing, amongst others, information on

  - the usage of **design patterns** in your project;
  - which **code smells** are still present at the end.
  
- Your **source code** and **report** will be stored at a **GitHub** repository that will be **given to you**.

- Using good **git** practices (like using **feature branches**) is a plus.

- Code needs to be **tested** extensively. Having a good design will help with this. Use **mocks** and **stubs** when needed.

- Students may implement a framework or abstraction layer on top of Lanterna to better organize their code. Projects that show careful architectural design in this way will be positively reflected in the grading.  

  :interrobang: **IMPORTANT**: Having a good design will help with some requirements changing mid-project. Be prepared for **some surprises**.: 

### Groups

The project should be done in groups of **three students** (:red_circle::eyes: teams are not allowed to be more than 3 elements!). If the number of students in a class is not a multiple of three, some groups will have only **two** elements.

### DELIVERABLES AND DELIVERIES

You should deliver the following two artifacts (both in your GitHub repository):

- **The source code**, which should follow good object oriented design practices, with close attention to the use of appropriate **design patterns**, in the **root** folder of the repository. All functionality should be adequately **unit-tested**. It should be possible to import the repository directly into *IntelliJ* and just run it using **“gradlew run”**. Your final submission must be in the **main** branch.

- **A report** written in markdown syntax, following the provided [template](template.md), in a *README.md* file on the **/docs/** folder. It should describe the features that are **implemented**, the features that are **planned**, the **design patterns** that have been used, and the existing **code smells**. It should also reflect the **quality** of the **unit tests** with **screenshots** and **links** to the **coverage** and **mutation** testing reports.

- You should also have an extra **simplified** version of the *README.md* file in your **root** folder with a simple description of the game, and some screenshots.


These two artifacts (code and report) should be continuously available in the project’s git repository and will be evaluated in two distinct points in time. **Check the deadlines on Moodle!**

In both of these deliveries the **code** and the **report** should reflect your implementation up to that point in time. The features reported as implemented should be properly **tested** and **bug-free**. Existing **unit tests** should all pass. The use of **design patterns** should be properly **motivated** and **described** using UML.

### Optional: Following a Test Driven Development Methodology

The following sequence is based on the book *Test-Driven Development by Example*:[\(2\]](https://en.wikipedia.org/wiki/Test-driven_development#cite_note-Beck-2)

- 1. **Add** a test

  The adding of a new feature begins by writing a test that passes [iff](https://en.wikipedia.org/wiki/Iff) the feature's specifications are met. The developer can discover these specifications by asking about [use cases](https://en.wikipedia.org/wiki/Use_case) and [user stories](https://en.wikipedia.org/wiki/User_story). A key benefit of test-driven development is that it makes the developer focus on requirements *before* writing code. This is in contrast with the usual practice, where unit tests are only written *after* code.

- 2. **Run** all tests. The new test *should fail* for expected reasons

  This shows that new code is actually needed for the desired feature. It validates that the [test harness](https://en.wikipedia.org/wiki/Test_harness) is working correctly. It rules out the possibility that the new test is flawed and will always pass.

- 3. **Write** the simplest code that passes the new test

  Inelegant or [hard code](https://en.wikipedia.org/wiki/Hard_code) is acceptable, as long as it passes the test. The code will be honed anyway in Step 5. No code should be added beyond the tested functionality.

- 4. All **tests** should now pass

  If any fail, the new code must be revised until they pass. This ensures the new code meets the [test requirements](https://en.wikipedia.org/wiki/Software_requirements) and does not break existing features.

###### Repeat

The cycle above is repeated for each new piece of functionality. Tests should be small and incremental, and commits made often. That way, if new code fails some tests, the programmer can simply [undo](https://en.wikipedia.org/wiki/Undo) or revert rather than [debug](https://en.wikipedia.org/wiki/Debug) excessively. When using [external libraries](https://en.wikipedia.org/wiki/Library_(computing)), it is important not to write tests that are so small as to effectively test merely the library itself,[[4\]](https://en.wikipedia.org/wiki/Test-driven_development#cite_note-Newkirk-4) unless there is some reason to believe that the library is buggy or not feature-rich enough to serve all the needs of the software under development.

###### Git Workflow

You should consider creating a new branch for each new feature you plan to develop.

