/*
 * Copyright 2012   Friedrich Große, Paul Seiferth,
 *                  Sebastian Starroske, Yannik Stein
 *
 * This file is part of MetaHeuristics4Java.
 *
 * MetaHeuristics4Java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MetaHeuristics4Java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MetaHeuristics4Java. If not, see <http://www.gnu.org/licenses/>.
 */

package de.mh4j.solver.termination;

import de.mh4j.solver.AbstractSolver;

public class StepCountTermination<GenericSolutionType> implements TerminationCondition {

    private final AbstractSolver<GenericSolutionType> solver;
    private final int maxStepCount;

    public StepCountTermination(AbstractSolver<GenericSolutionType> solver, int maxStepCount) {
        this.solver = solver;
        this.maxStepCount = maxStepCount;
    }

    @Override
    public boolean shouldTerminate() {
        return solver.getNumberOfSteps() >= maxStepCount;
    }
}
